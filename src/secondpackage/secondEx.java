package secondpackage;

import javapackage1.*;

public class secondEx {

	int i=10;
	static int j=19;
	public void print()
	{
		System.out.println("Inside Print Method");
	}
	
	public static void printStatic()
	{
		System.out.println("Inside Print Static Method");
	}


	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.printHello();

	}

}
