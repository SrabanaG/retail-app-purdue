package com.abc.retail;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet {
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
	   throws ServletException, IOException {
	response.setContentType("text/html");
	response.getWriter().println("<h1>Add Product Servlet is Working!</h1>");
   }
}

