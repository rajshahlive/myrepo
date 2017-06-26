package mytest;

/*
Java Class example.
Syntax of defining java class is,
<modifier> class <class-name>{
  // members and methods
}
*/
public class JavaClassExample{
	
	
  /*
  Syntax of defining members of the java class is,
    <modifier> type <name>;
  */
  private String name;
  
  
  /*
  Syntax of defining methods of the java class is,
  <modifier> <return-type> methodName(<optional-parameter-list>) <exception-list>{
                    ...
  }
  */
  
  public void setName(String n){
    //set passed parameter as name
    name = n;
    System.out.println(name); 
    
  }
  
  public String getName(){
    //return the set name
    return name;
    
  }
  
  
  
  //main method will be called first when program is executed
  public static void main(String args[]){
	  
    /*
    Syntax of java object creation is,
    <class-name> object-name = new <class-constructor>;
    */
    JavaClassExample obj = new JavaClassExample();
    
    //set name member of this object
    obj.setName("Visitor");
    
    // print the name     
    System.out.println("Hello " + obj.getName());      
  }
}
 
/*
OUTPUT of the above given Java Class Example would be :
Hello Visitor
*/