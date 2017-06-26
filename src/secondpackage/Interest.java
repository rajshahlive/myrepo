package secondpackage;
class Bank {
	int getRateOfInterest()
	{
		return 0;
		}  
}

class SBI extends Bank {
	int getRateOfInterest()
	{
		return 8;
		}  
}

class Corp extends Bank {
	int getRateOfInterest()
	{
		return 10;
		}  
}

public class Interest {
	
	public static void main(String[] args) {
		Bank obj2 = new Bank ();
		System.out.println("Interest is " +obj2.getRateOfInterest());
		
		SBI obj = new SBI ();   //override parent method
		System.out.println("Interest is " +obj.getRateOfInterest());
		
		Corp obj1 = new Corp ();  //override parent method
		System.out.println("Interest is " +obj1.getRateOfInterest());
		
	}

}