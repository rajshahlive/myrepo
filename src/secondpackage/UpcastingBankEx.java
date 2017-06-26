package secondpackage;

class Bank1{  
int getRateOfInterest(){return 0;}  
}  
  
class SBI1 extends Bank1{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank1{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank1{  
int getRateOfInterest(){return 9;}  
}  

public class UpcastingBankEx {
	
	public static void main(String args[]){  
		Bank1 b1=new SBI1();  
		Bank1 b2=new ICICI();  
		Bank1 b3=new AXIS();  
		System.out.println("SBI Rate of Interest: "+b1.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+b2.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+b3.getRateOfInterest());  
	    }  
}  
