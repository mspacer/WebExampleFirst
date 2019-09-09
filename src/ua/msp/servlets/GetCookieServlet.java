package ua.msp.servlets;

import ua.msp.servlets.ua.msp.servlets.util.HtmlUtil;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();

        String pageHtml = HtmlUtil.headWrapper("GetCookies");

        String cookieHtml = "";
        for (Cookie cookie: cookies) {
            cookieHtml +=  HtmlUtil.h1Wrapper(cookie.getName() + " = " + cookie.getValue());
        }
        pageHtml += HtmlUtil.bodyWrapper(cookieHtml);

        response.getWriter().println(HtmlUtil.htmlWrapper(pageHtml));
    }
}
