package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/allquotes")
public class AllQuntoes {

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            HttpSession session = request.getSession();
            List<Quote> quotes = (List<Quote>) session.getAttribute("quotes");
            if (quotes == null) {
                quotes = new ArrayList<>();
            }
            request.setAttribute("quotes",quotes);
            request.getServletContext().getRequestDispatcher("/allquotes.jsp").forward(request, response);

        }
    }
