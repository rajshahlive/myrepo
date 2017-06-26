package mytest;

public class myclass {

	public void sum (int a, int b)
	{
		int c;
		c = a + b ;
		System.out.println(c);
				
	}
	
	public static void main(String[] args) 
	{
		myclass obj = new myclass();
		obj.sum(1, 5);
	}


}
