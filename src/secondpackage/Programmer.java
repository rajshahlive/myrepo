package secondpackage;

import java.util.Scanner;

class Employee {
	float salary ;
	public void msg(){
		System.out.println("Salary is Credited :) ");
	}  
}
public class Programmer extends Employee {
	int bonus;
	//public void msg(){             // override parent method.
	//	System.out.println(" Credited :) ");
	//}  
	public static void main(String[] args) {
		Programmer obj = new Programmer () ;
		System.out.println("Enter Salary And Bonus");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		obj.salary =in.nextFloat();
		obj.bonus = in.nextInt();
	System.out.println("programmer salary is " + obj.salary);
	System.out.println("programmer salary is " + obj.bonus);
	obj.msg();
	}

}