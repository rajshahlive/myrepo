package secondpackage;

public class Constructoroverloading {

	public Constructoroverloading (int a , int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public Constructoroverloading ()
	{
		System.out.println("inside default constructor");
	
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Constructoroverloading obj = new Constructoroverloading();
		Constructoroverloading obj1 = new Constructoroverloading(10 , 20);
				
	}
}
