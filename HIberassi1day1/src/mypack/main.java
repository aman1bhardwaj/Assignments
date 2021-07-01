package mypack;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class main {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction trans=null;
		try
		{
			trans=session.beginTransaction();
			Student s=new Student();
			s.setName("aman");
			s.setAge(23);
			s.setAddress("prayagraj");
			
			session.save(s);
			trans.commit();
			System.out.println("done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
