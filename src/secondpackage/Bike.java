package secondpackage;

class Vehicle {
	void run () {
		System.out.println("i am vehicle");
		
	}
}

public class Bike extends Vehicle {

	void run () {
		System.out.println("i am Bike");
	}
		public static void main(String[] args) {
						
			Bike obj = new Bike ();       //override parent method
			obj.run();
			
			//Vehicle obj1 = new Vehicle ();
			//obj1.run();			
						
		}
}