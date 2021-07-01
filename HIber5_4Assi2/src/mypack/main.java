package mypack;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction trans=null;
		
		try
		{
			trans=session.beginTransaction();
		Dept d1=new Dept();
		d1.setDname("saurav");
		d1.setLoc("kanpur");
		
		session.save(d1);
		
		Dept d2=new Dept();
		d2.setDname("saur");
		d2.setLoc("prayagraj");
		
		session.save(d2);
		
		Dept d3=new Dept();
		d3.setDname("alok");
		d3.setLoc("kanpur");
		
		session.save(d3);
		trans.commit();
		session.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
