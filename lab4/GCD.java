

public class GCD {

	public static void main(String[] args) {
		int x = 64;
		int y = 48;
		int a = x;
		int b = y;
		
		int q = a / b;
		int r = a % b;
		
		
		while (r != 0)
		{
			a = b;
			b = r;
		    q = a / b;
		    r = a % b;
			
		}
		System.out.println("GCD of " + x + 
				" and " + y + " is " + b);

	}

}



