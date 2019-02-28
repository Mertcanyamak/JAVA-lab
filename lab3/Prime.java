//lab3
public class Prime {

	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		
		for (int number = 2 ; number < limit ; number ++) {
			boolean isPrime = true;
			
			//check prime
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
		}    
				System.out.print(number + " ");
			
		
		
		
	}

  }
// public static boolean isPrimeNumber	
	
}



