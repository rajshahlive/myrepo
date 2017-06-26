package overrideEX;

public class overrideExample extends FirstClassForOerride {

	@Override
	public void Sum()
	{
		System.out.println("Inside Child Class Sum");
	}
	
	public void Display()
	{
		System.out.println("Inside Child Class Display");
	}

	
	
	
	public static void main(String[] args) {
		
		FirstClassForOerride obj = new overrideExample();
//		FirstClassForOerride obj1 = new FirstClassForOerride();
		
		obj.Sum();
		obj.Sub();
		

	}

}
