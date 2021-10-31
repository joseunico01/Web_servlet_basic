package ejer1.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaludoServlet extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
                String valor1=request.getParameter("nombre");
                String valor2=request.getParameter("edad");

                int edad;
                String mensaje="";
                String error="";

                try{
                        edad=Integer.parseInt(valor2);
                       if(edad <0 || edad>100){
                               error="Error, la edad invalida";
                       }else{
                               mensaje="Hola "+valor1+" tu edad es de "+edad+" y naciste entre el "+(2021-edad);
                       }
                }catch(Exception e){
                        error="Error, Datos incorrectos";
                }
                //agregamos los atributos para poder redireccionar las paginas
                if(error.isEmpty()){
                        //si no hay errores
                        request.setAttribute("mensaje", mensaje);
                }else{
                        //cuando hay error
                        request.setAttribute("error", error);
                }
                //Redireccionar las paginas
                request.getRequestDispatcher("/ejer1/index.jsp").forward(request, response);

		
	}

	// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Returns a short description of the servlet.
	 *
	 * @return a String containing servlet description
	 */
	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}
