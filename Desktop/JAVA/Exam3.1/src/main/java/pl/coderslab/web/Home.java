package pl.coderslab.web;

import com.mysql.cj.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/homepage")
public class Home extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cookie = request.getParameter("cookie");
        if (StringUtils.isNullOrEmpty(cookie)) {
            Cookie cookieAccept = new Cookie("cookieAccept", "accepted");
            response.addCookie(cookieAccept);
        }

        getServletContext().getRequestDispatcher("/homepage.jsp").forward(request, response);


    }

}
