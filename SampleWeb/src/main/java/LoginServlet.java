

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Login Servlet executed !!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getParameter("txtusername");
		String pass=request.getParameter("txtpassword");
		boolean ans=AuthenticationService.checkUserInfo(user, pass);
		if(ans==true)
		{
			RequestDispatcher dispatcher= request.getRequestDispatcher("Dashboard.jsp");
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher= request.getRequestDispatcher("Error.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
