package secondpackage;

public class staticEx {
	
	public static void Sum(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	public void Inr()
	{
		int a=10; 
		a++;
		System.out.println(a);
	}
	public void Rel()
	{
		int a=20; 
		int b=0;
		if (a==b)
			System.out.println("match");
		else
			System.out.println("no match");
	}

	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		staticEx.Sum(1,9);
		staticEx obj = new staticEx();
		obj.Sum(10,10);		
		obj.Inr();
		obj.Rel();
		
	}

}
