package secondpackage;

public class exceptionexample {

	public void div(int a , int b) 
	{
		try {
		
		int c = a / b;
		System.out.println(c);
		}
		catch (ArithmeticException e) 
		{
		    System.out.println("Exception caught: Division by zero.");	
		    }
		catch (Exception e) 
		{
		    System.out.println(e);
		    }
		
		
	}
	
	public static void main(String[] args) {
		exceptionexample obj = new exceptionexample ();
		obj.div(9,0);
				
		
	}

}