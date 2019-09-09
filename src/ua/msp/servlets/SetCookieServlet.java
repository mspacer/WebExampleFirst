package ua.msp.servlets;

import ua.msp.servlets.ua.msp.servlets.util.HtmlUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("name", "Serg_idea");
        cookie.setMaxAge(60 * 60);
        response.addCookie(cookie);

        Cookie cookie1 = new Cookie("age", "Serg_46");
        cookie1.setMaxAge(60 * 60);
        response.addCookie(cookie1);

        Cookie cookie2 = new Cookie("forDel", "forDel_cookie ");
        cookie2.setMaxAge(60 * 60);
        cookie2.setDomain("localhost");
        response.addCookie(cookie2);

        response.getWriter().println(HtmlUtil.htmlWrapper(HtmlUtil.headWrapper("Set cookie") + HtmlUtil.bodyWrapper(HtmlUtil.h1Wrapper("Cookie has added."))));
    }
}
