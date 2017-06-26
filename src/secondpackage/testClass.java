package secondpackage;

//below interface is defined separately testinterface.
//public interface testinterface 
//{ 
//public void sum();
//public void sub();
//} 

public class testClass implements testinterface {

	public static void main(String[] args) {
		testClass obj = new testClass ();
		obj.sum();
		obj.sub();

	}

	public void sum() {
		int a=10;
		int b=10;
		int c;
		c=a+b;
		System.out.println(c);
	
		
	}

	public void sub() {
		int a=10;
		int b=10;
		int c=0;
		c = a - b ;
		System.out.println(c);
		
	}

}
