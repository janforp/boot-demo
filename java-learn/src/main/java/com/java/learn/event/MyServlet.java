package com.java.learn.event;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 类说明：
 *
 * @author janita
 * @since 2019-05-30 - 19:49
 */
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Myservlet正在处理 get() 请求...");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=utf-8");
        out.println("<string>My Servlet!</strong>");
    }
}
