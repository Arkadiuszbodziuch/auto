package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/regex")
public class Regex extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String param1 = req.getParameter("param1");

        final String PATTERN = "[a-z]*.(jpg)|[a-z]*.(gif)|[a-z]*.(png)";

        if (param1.matches(PATTERN)) {
            resp.sendRedirect("https://www.google.pl/#q=cat.jpg");
        } else {
            resp.getWriter().println("Niepoprawna nazwa");
        }
    }
}
