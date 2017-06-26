package overrideEX;

public class arrayEx {

//	static int value = 10;
	
	public static void main(String[] args) {
		int value = 10;
		int[] a = new int[5];
		for(int i=0;i<5;i++)
		{
			a[i] = value+ i;
			System.out.println(a[i]);
			value++;
		}

	}

}
