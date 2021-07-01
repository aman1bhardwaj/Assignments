package mypack;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;

import mypack.HibernateUtil;

/**
 * Servlet implementation class DataServlet
 */
@WebServlet("/DataServlet")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String loc=request.getParameter("location");
		Session session=HibernateUtil.getSessionFactory().openSession();
		try
		{
			Query<?> query=session.createQuery("from Dept where loc=:x");
			query.setParameter("x",loc);
			
			List<?> mylist=(List<?>)query.list();
			
			request.setAttribute("mylist", mylist);
			
			RequestDispatcher rd=request.getRequestDispatcher("Data.jsp");
			rd.forward(request, response);
			
			System.out.println(mylist);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
