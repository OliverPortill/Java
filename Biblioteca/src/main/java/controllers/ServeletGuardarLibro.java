package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import controllers.LibroControllers; 

/**
 * Servlet implementation class ServeletGuardarLibro
 */
@WebServlet("/ViewsLibros.jsp")
public class ServeletGuardarLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletGuardarLibro() {
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
		guardarLibro(request, response);
	}

	private void guardarLibro(HttpServletRequest rq, HttpServletResponse rs) {
		int Codigo = Integer.valueOf(rq.getParameter("code"));
		String Autor = rq.getParameter("author");
		String Titulo = rq.getParameter("title");
		int Año = Integer.valueOf(rq.getParameter("year"));
		String Estado = rq.getParameter("status");
		String Editorial = rq.getParameter("editorial");
		
		new LibroControllers().guardarLibro(Codigo, Autor, Titulo, Año, Estado, Editorial);
		
		try {
			rs.sendRedirect("ViewsLibros.jsp");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
