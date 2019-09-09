package ua.msp.servlets;

import ua.msp.servlets.ua.msp.servlets.util.HtmlUtil;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie cookie = new Cookie("forDel", "");
        cookie.setMaxAge(0);
        response.getWriter().println(HtmlUtil.htmlWrapper(HtmlUtil.headWrapper("Del cookie") + HtmlUtil.bodyWrapper( HtmlUtil.h1Wrapper("Cookie forDel has deleted."))));

    }
}
