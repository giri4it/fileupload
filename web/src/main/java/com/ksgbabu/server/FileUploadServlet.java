package com.ksgbabu.server;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FileUploadServlet extends HttpServlet{

    @Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Test");
        response.getWriter().println("<html><h2>Welcome</h2></html>");
        response.setStatus(200);
        response.flushBuffer();
	}

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("in Get request");
        response.getWriter().println("<html><h2>Welcome</h2></html>");
        response.setStatus(200);
        response.flushBuffer();

    }
}
