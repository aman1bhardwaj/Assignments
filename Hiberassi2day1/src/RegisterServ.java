

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import mypack.HibernateUtil;
import mypack.Register;

/**
 * Servlet implementation class RegisterServ
 */
@WebServlet("/RegisterServ")
public class RegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServ() {
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
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		String login=request.getParameter("login");
		String password=request.getParameter("password");
		
		Register r=new Register();
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction trans=null;
		try
		{
			PrintWriter pw=response.getWriter();
			trans=session.beginTransaction();
			r.setName(name);
			r.setAddress(address);
			r.setEmailid(email);
			r.setLogin(login);
			r.setPassword(password);
			
			session.save(r);
			trans.commit();
			System.out.println("done");
			pw.println("Succesfully registered");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
