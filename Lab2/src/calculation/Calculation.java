package calculation;

import java.text.DecimalFormat;

public class Calculation {
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public double divide(int num1, int num2) {
		DecimalFormat df = new DecimalFormat("0.0");
		double tmp = (double)(num1)/num2;
		return Double.valueOf(df.format(tmp));
	}

}
