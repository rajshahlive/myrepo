package secondpackage;
//example of abstract class that have method body  
abstract class Bike3{ 
	
 //constructor
	Bike3(){
	 System.out.println("bike is created");
	 }  
	
	//abstract method
 abstract void run();  
 
 //other method and implementation
 void changeGear(){
	 System.out.println("gear changed");
	 }  
}  

class Honda extends Bike3{  
	
	//abstract method implementation
	 void run(){System.out.println("running safely..");}  
	 }  

public class TestAbstraction2 {

	public static void main(String[] args) {
		Bike3 obj = new Honda ();
		obj.run();
		//obj.changeGear();

	}

}
