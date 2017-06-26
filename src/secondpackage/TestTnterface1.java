package secondpackage;

interface Printable{  
void print();  
}  

interface Showable{  
void print();  
}  

public class TestTnterface1 implements Printable, Showable{
	
	public void print(){
		System.out.println("Hello");
		}
	
	public void show(){
		System.out.println("Welcome");
		}  
	
	public static void main(String[] args) {
		
		TestTnterface1 obj = new TestTnterface1 ();
		obj.print();
		obj.show();
	}

}
