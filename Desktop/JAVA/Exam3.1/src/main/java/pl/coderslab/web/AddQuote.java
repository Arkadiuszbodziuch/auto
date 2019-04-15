package pl.coderslab.web;

import com.mysql.cj.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/addquote")
public class AddQuote {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String author = request.getParameter("author");
        String content = request.getParameter("content");
        if (StringUtils.isNullOrEmpty(content) || StringUtils.isNullOrEmpty(content)) {
            doGet(request,response);
        }
        Quote quote = new Quote(author,content);
        HttpSession session = request.getSession();
        List<Quote> quotes = (List<Quote>) session.getAttribute("quotes");
        if (quotes == null) {
            quotes = new ArrayList<>();
        }
        quotes.add(quote);
        session.setAttribute("quotes",quotes);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getServletContext().getRequestDispatcher("/addquote.jsp").forward(request, response);
    }
}

