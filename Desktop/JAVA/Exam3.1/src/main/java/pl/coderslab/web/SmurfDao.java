package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@WebServlet("/smurfs")
public class SmurfDao extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/form.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Smurf> smurfs = new ArrayList<>();
        HttpSession session = req.getSession();
        if (Objects.nonNull(session.getAttribute("smurfs"))){
            smurfs.addAll((List<Smurf>) session.getAttribute("smurfs"));
        }
        String name = req.getParameter("name");
        String atribute = req.getParameter("atribute");
        String desription = req.getParameter("desription");
        smurfs.add(new Smurf(name, atribute, desription));

        session.setAttribute("smurfs", smurfs);

        getServletContext().getRequestDispatcher("/smurfs.jsp")
                .forward(req, resp);

    }
}
