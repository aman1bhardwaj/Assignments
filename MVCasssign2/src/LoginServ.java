

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String login=request.getParameter("Login");
		String password=request.getParameter("Password");
		
		Loginbean lb=new Loginbean();
		Boolean s=lb.valid(login,password);
		
		
		System.out.println(s);
		if(s==true)
		{
			request.setAttribute("login", login);
			RequestDispatcher rd1=request.getRequestDispatcher("Success.jsp");
			rd1.forward(request, response);
		}
		else if(s==false)
		{
			RequestDispatcher rd2=request.getRequestDispatcher("Fail.jsp");
			rd2.forward(request, response);
		}
	}

}
