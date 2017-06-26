package secondpackage;

public class nestedmethodCall {

public void FirstMethod()
{
	System.out.println("Inside First Method");
}

public void SecondMethod() {
	FirstMethod();
	System.out.println("Inside Second Method");
}
	public static void main(String[] args) {

nestedmethodCall objCall = new nestedmethodCall();
objCall.SecondMethod();

	}

}
