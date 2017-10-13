package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.GestionLibros;

@WebServlet("/LibrosAction")
public class LibrosAction extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestionLibros glibros = new GestionLibros();
		int idTema=Integer.parseInt(request.getParameter("tema"));
		List libros=glibros.obtenerLibros(idTema);
		
		request.setAttribute("libros", libros);
		request.getRequestDispatcher("libros.jsp").forward(request, response);
	}

}
