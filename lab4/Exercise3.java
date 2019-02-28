public class GreatestDemo{

    public static void main(String[] args){

    	int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
	int value3 = Integer.parseInt(args[2]);

	if(value1>=value2 && value1>=value2) 
	{
	System.out.println(value1);
	}
	else if(value2>=value1 && value2>=value3) 
	{
	System.out.println(value2);
	}
	else if(value3>=value1 && value3>=value2) 
	{
	System.out.println(value3);
	}
    }
}

public class Exercise3 {

	public static void main(String[] args) {
		System.out.println(int2Bin(12));
	}
	
	public static String int2Bin(int number) {
		
		if (number == 0 || number == 1)
			return number+ "";	
		return int2Bin(number/2) + (number%2);
	}

}



