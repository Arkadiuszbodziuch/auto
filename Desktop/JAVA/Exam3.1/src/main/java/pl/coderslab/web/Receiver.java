package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/receiver")
        public class Receiver extends HttpServlet {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

                String name = req.getParameter("name");
                String mail = req.getParameter("mail");
                String id = req.getParameter("id");

                resp.getWriter().println(name+" " +mail+" "+id);
            }}
