public class Question2 {
	
	 private static int min(int a, int b, int c) {
		 
		 int min = a < b ? a : b;
		 return min < c ? min : c;
	 }

	 private static int minV2(int a, int b, int c) {
		 
		 int min =a;
		 if (b < min) {
			 min = b;
		 }
		 if (c < min)
			 min = c;
		 
		 return min;
		 
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(min(9,7,5));
		 System.out.println(minV2(15,10,5));
		 
	 
	 }
}
