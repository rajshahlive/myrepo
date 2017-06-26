package ProgramFlow;

public class callByRefernceEX {

	
	public void Sum(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	
	public void print(String s)
	{
		System.out.println(s);
	}
	
	
	
	
	public static void main(String[] args) {
		
callByRefernceEX obj = new callByRefernceEX();

	obj.Sum(10, 19);
	
	
	String str = "Hello";
	obj.print(str);


	}

}
