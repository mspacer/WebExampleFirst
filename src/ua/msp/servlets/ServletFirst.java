package ua.msp.servlets;

import java.io.IOException;

public class ServletFirst extends javax.servlet.http.HttpServlet {
    static  int i = 0;
    int j = 100;
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
     System.out.println("ServletFirst doPost executed");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("ServletFirst doGet executed thread id : " + Thread.currentThread().getId() + ", i = " + (++i) + ", j = " + (--j) );
        String name = request.getParameter("name");

        //request.getRequestDispatcher("page1.jsp").forward(request,response);
        response.sendRedirect(request.getContextPath() +  "/servletSecond");
    }

    @Override
    public void destroy() {
        System.out.println("ServletFirst destroyed ");
        super.destroy();
    }
}
