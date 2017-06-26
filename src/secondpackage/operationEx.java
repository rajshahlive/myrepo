package secondpackage;

public class operationEx {



	public operationEx()
	{
		
		System.out.println("Inside Constructor");
	}
	
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

	
	public static void main(String[] args) {
		operationEx obj = new operationEx();
//		obj.Sum(11,22);
		operationEx.Sum(1,9);
		obj.Inr();
		obj.Rel();
		secondEx secObj=new secondEx();
		secObj.print();
		secondEx.printStatic();
	}

}
