package br.com.teste.mercado.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.teste.mercado.bo.MercadoriaBO;

/**
 * Servlet implementation class MercadoriaServlet
 */
@WebServlet("/MercadoriaServlet")
public class MercadoriaServlet extends HttpServlet {
	
	private MercadoriaBO mercadoriaBO = new MercadoriaBO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
