package zyn.web;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String gender = req.getParameter("gender");

        String[] hobbies = req.getParameterValues("hobbies");
        String[] address = req.getParameterValues("address");

        String description = req.getParameter("textarea");

        String hiddenValue = req.getParameter("aaa");
        System.out.println(username);
        System.out.println(password);
        System.out.println(gender);
        System.out.println(hobbies);
        System.out.println(address);
        System.out.println(description);
        System.out.println(hiddenValue);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
