package secondpackage;

interface A{  
void a();  
void b();  
void c();  
void d();  
}  

//abstract class can also be used to provide some implementation of the interface
abstract class B implements A{  
	public void c(){
	System.out.println("I am C");
		}  
      }

class M extends B{  
	
      public void a(){
    	  System.out.println("I am a");
    	  }  
      public void b(){
    	  System.out.println("I am b");
    	  }  
      public void d(){
    	  System.out.println("I am d");
    	  }  
}  

public class interfaceandabstract {

	public static void main(String[] args) {
		// A has all the methods defined hence A obj 
		// M has all the methods declared hence new M ()
		A obj = new M (); 
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}

}
