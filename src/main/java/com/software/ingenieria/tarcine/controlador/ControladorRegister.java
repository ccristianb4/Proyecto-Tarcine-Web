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
 * Servlet implementation class ControladorRegister
 */
@WebServlet("/ControladorRegister")
public class ControladorRegister extends HttpServlet {
	UsuarioCrud c = new UsuarioCrud();
	Usuario u = new Usuario();
	boolean v;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String boton = request.getParameter("accionRegister");
		if (boton.equals("sign in")) {
			u.setNombre(request.getParameter("txtName"));
			u.setUserName(request.getParameter("txtUserName"));
			u.setCorreo(request.getParameter("txtemail"));
			u.setPassword(request.getParameter("txtpassword"));
			v = c.agregar(u);
			if(v) {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("RegisterTarcine.jsp").forward(request, response);
			}
		}
	}

}
