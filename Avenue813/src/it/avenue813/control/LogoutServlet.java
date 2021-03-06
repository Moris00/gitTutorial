package it.avenue813.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import it.avenue813.model.CarrelloBean;
import it.avenue813.model.UserBean;
import it.avenue813.model.UserModelDS;
import it.avenue813.utils.Utility;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	  public LogoutServlet() {
	        super();
	    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserModelDS user = new UserModelDS((DataSource) getServletContext().getAttribute("DataSource"));
		
		
		HttpSession sessionUser = request.getSession();
		UserBean bean = new UserBean();
		try {
			bean = user.canLogin((String) sessionUser.getAttribute("username"), (String) sessionUser.getAttribute("passw"));
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
			if(bean == null) {
				sessionUser.invalidate();
				response.sendRedirect("/Avenue813/PaginaHome/home.jsp");
			}else {
			
			if(((String)sessionUser.getAttribute("numero_ordini")) != null) {
				String c = (String) sessionUser.getAttribute("numero_ordini");
				int a = Integer.parseInt(c);
				bean.setNumero_ordini(a);
				try {
					user.toUpdateOrdini(bean);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}else {
				response.sendRedirect("/Avenue813/PaginaHome/home.jsp");
			}
			sessionUser.invalidate();
			
			response.sendRedirect("/Avenue813/PaginaHome/home.jsp");
		} 
		
		
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
