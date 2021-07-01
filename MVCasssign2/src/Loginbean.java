

public class Loginbean {
	
	public Boolean valid(String log,String pass)
	{
		Boolean success=null;
		if(log.equalsIgnoreCase("aman") && (pass.equalsIgnoreCase("1234")))
		{
			success=true;
		}
		else
		{
			success=false;
		}
		return success;
		
	}

}
