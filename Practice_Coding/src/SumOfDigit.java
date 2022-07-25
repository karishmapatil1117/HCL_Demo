
public class SumOfDigit {

	public static void main(String[] args) {
		int number=5409;
		int sum=0;
		
		while(number>0)
		{
			//finds the last digit of the given number    
			int digit = number % 10;  
			//adds last digit to the variable sum  
			sum = sum + digit;  
			//removes the last digit from the number  
			number = number / 10;  
		}
		
		System.out.println("Sum of Digit is:"+sum);
	}

}
