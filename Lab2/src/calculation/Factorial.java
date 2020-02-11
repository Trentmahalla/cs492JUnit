package calculation;

public class Factorial {
	
//	Calculate the factorial of a number
		public static int factorial(int n) {
			if (n < 0)       
				throw new IllegalArgumentException( "factorial cannot handle negative numbers!!" );     
			if (n == 0)       
				return 1;     
			else       
				return n * factorial(n - 1);  
		}
	}
