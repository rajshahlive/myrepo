package mytest;

public class first {

	
	public void firstPrint() {
		second obj=new second();
		obj.sum();
	}
	
	private class second {

		
		public void sum() {
			
			int c;
			int a = 10;
			int b=10;
			c=(a+b);
			System.out.println(c);
			

		}

	}

}





