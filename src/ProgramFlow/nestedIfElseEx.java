package ProgramFlow;

public class nestedIfElseEx {
		
	public static void main(String[] args) {

int a; //variable type declaration
a=10; //assignment

int b=15;
int c=20;

if (b<c)
				{
					System.out.println("Outer IF -- B is smaller " +b);
							if(a<b)
							{
								System.out.println("Inner IF -- A is smaller "+a);
							}
							else
							{
								System.out.println("Inner ELSE -- B is smaller");
							}
				}

else
				{
					System.out.println("Outer ELSE -- C is smaller");
				}

	}

}
