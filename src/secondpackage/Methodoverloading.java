package secondpackage;
import java.util.Scanner;
public class Methodoverloading {

	public void area ()
	{
		float b, h ;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");
		 
		  b = input.nextFloat();
		  h = input.nextFloat();
		  
		float area = (b * h)/2 ;
		System.out.println("area of triangle " + area);
	}
	
	public void area (float l)
	{
		
		float area = l * l ;
		System.out.println("area of square " + area);
	}
	
	public static void main(String[] args) {
		Methodoverloading obj = new Methodoverloading ();
				obj.area();
				obj.area(55);

	}

}