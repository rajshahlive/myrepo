package secondpackage;

public class exceptiondefault {

	public void div(int a , int b) 
	{
		try {
		
		int c = a / b;
		System.out.println(c);
		}
		
		catch (Exception e) 
		{
		    System.out.println(e);
		    }
		
		//catch (ArithmeticException e) 
		//{
		    //System.out.println("Exception caught: Division by zero.");	
		   // }
		
		
	}
	
	public static void main(String[] args) {
		exceptiondefault obj = new exceptiondefault ();
		obj.div(9,0);
				
		
	}

}