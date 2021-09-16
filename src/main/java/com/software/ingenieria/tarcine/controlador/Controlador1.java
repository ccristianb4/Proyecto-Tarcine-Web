package com.software.ingenieria.tarcine.controlador;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.software.ingeneria.tarcine.modelo.Usuario;
import com.software.ingeneria.tarcine.modelo.UsuarioCrud;

/**
 * Servlet implementation class Controlador1
 */
@WebServlet("/Controlador1")
public class Controlador1 extends HttpServlet {
	UsuarioCrud c = new UsuarioCrud();
	Usuario u = new Usuario();
	int r;
	//@Resource(name="jdbc/Tarcine")
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html;charset=ISO-8859-1");
		String accion = request.getParameter("accion");
		if(accion.equals("Log In")) {
			String user = request.getParameter("txtUser");
			String pass = request.getParameter("txtpass");
			//System.out.println(user);
			//System.out.println(pass);
			u.setUserName(user);
			u.setPassword(pass);
			r = c.validar(u);
			System.out.println(r);
			if(r == 1) {
				request.getRequestDispatcher("TarcinePrincipal.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}
	}

}
