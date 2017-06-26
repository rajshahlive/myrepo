package secondpackage;

public class multiplereturn {
	
	public int sum(int a , int b) 
	{
		int c = a + b;
		if (c>10)
			return c;
		else
			return a;
	}
	
	public static void main(String[] args) {
		multiplereturn obj = new multiplereturn ();
		int d = obj.sum(5, 6);
				System.out.println (d);
		
	}

}
