package secondpackage;

class Bike1{  
	  void run(){System.out.println("running");}  
	}  


public class UpcastingBikeEx extends Bike1{  
	  void run(){System.out.println("Splender running safely with 60km");}  
	  
	  public static void main(String args[]){  
	    Bike1 obj = new UpcastingBikeEx(); // upcasting 
	    //parent class reference variable refers to the subclass object  
	    obj.run();  
	  }  
	}  