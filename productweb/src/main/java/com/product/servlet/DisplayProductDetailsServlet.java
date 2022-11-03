package com.product.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.bo.ProductBO;
import com.product.bo.ProductBOImpl;
import com.product.dto.Product;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
  		ProductBO bo = new ProductBOImpl();
  		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
  		
  		PrintWriter out = response.getWriter();
  		out.print("product details..");
  		out.print("product ID :" +product.getId());
  		out.print("Product Name :" +product.getName());
  		out.print("Product description : " +product.getDescription());
  		out.print("Product Price :" +product.getPrice());
  		
  	}

}
