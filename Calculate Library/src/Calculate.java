/*Jonathan Ballona
 * September 6, 2017
 * Our self written math library...
 * it contains a series of methods to do basic math functions.
 */
public class Calculate {
	
	//returns the squared integer
	public static int square (int operand) {
		int squared =  operand*operand;
		return squared;
	}
	
	public static int cube (int operand) {
		int cubed = operand*operand*operand;
		return cubed;
	}
	
	public static double average (double avgNum1, double avgNum2) {
		double mean = (avgNum1 + avgNum2)/2;
		return mean;
	}
	
	public static double average (double avgNum1, double avgNum2, double avgNum3) {
		double mean = (avgNum1 + avgNum2 + avgNum3)/3;
		return mean;
	}
	
	public static double toDegrees (double radian) {
		double degree = (radian*180)/3.14159;
		return degree;
	}
	
}
