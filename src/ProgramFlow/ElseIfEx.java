package ProgramFlow;

public class ElseIfEx {
		
	public static void main(String[] args) {

int a; //variable type declaration
a=10; //assignment

int b=15;
int c=20;

if (a>b)
{
	System.out.println("IF -- B is smaller " +b);
}
else if(a<b)
	{
	System.out.println("Else IF -- A is smaller "+a);
	}
		else
			{
				System.out.println("ELSE -- C is smaller" +c);
				}
}
}
