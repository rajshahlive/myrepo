package secondpackage;
//below abstract class provided in class Bike2.
//abstract class Bike2{  
	 // abstract void run();  
	//}  

public class AbstractHonda extends Bike2{
	void run(){
		System.out.println("running safely..");
		}  
	
	public static void main(String[] args) {
		Bike2 obj = new AbstractHonda () ;
		obj.run();

	}

}
