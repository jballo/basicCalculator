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
	
	public static double toRadians (double degrees) {
		double radian = (degrees*3.14159)/180;
		return radian;
	}
	
	public static double discriminant (double coefA, double coefB, double coefC) {
		double disc = (coefB*coefB) - (4*coefA*coefC);
		return disc;
	}
	
	public static String toImproperFrac (int wholeNum, int numerNum, int denomNum) {
		int impNum = (wholeNum*denomNum) + numerNum;
		String impFrac = impNum + "/" + denomNum;
		return impFrac;
	}
	
	public static String toMixed ( int impNumer, int denom) {
		int wholeNum = impNumer/denom;
		int mixNumer = impNumer%denom;
		String imprFrac = wholeNum + "_" + mixNumer + "/" + denom;
		return imprFrac;
	}
	
	public static String foil ( int varA, int varB, int varC, int varD, String input) {
		String vara = (varA*varB) + input + "^2";
		String varb = (varA*varC) + (varA*varD) + input;
		int varc = varB*varD;
		String equation = vara + " + " + varb + " + " + varc;
		return equation;
	}

	public static String isDisvisibleBy (int dividend, int divisor) {
		if(dividend%divisor == 0) {
			return "Yes";
		}else {
			return "No";
		}
	}
	
	public static double absValue (double numb) {
		if(numb <=0) {
			return (numb*-1);
		}else {
			return numb;
		}
	}
	
	public static double max (double frstNum, double secNum) {
		if(frstNum > secNum) {
			return frstNum;
		}else if(secNum> frstNum){
			return secNum;
		}else{
			return frstNum;
		}
	}
	
	public static double max (double frstNum, double secNum, double thrdNum) {
		if(frstNum > secNum && frstNum > thrdNum) {
			return frstNum;
		}else if(secNum > frstNum && secNum > thrdNum) {
			return secNum;
		}else{
			return thrdNum;
		}
	}
	
	public static double min (int frstNum, int secNum) {
		if(frstNum < secNum) {
			return frstNum;
		}else {
			return secNum;
		}
	}
	
	public static double round2 (double rdNum){
		double newNum = rdNum * 1000;
		double takeAwayNum = newNum % 10;
		
		if(newNum > 0) {
			if(newNum%10 >=5 ) {
				newNum = newNum - takeAwayNum;
				newNum = newNum + 10;
				newNum = newNum/1000;
			}
		}else {
			if(newNum%10 <= 5){
				newNum = newNum - takeAwayNum;
				newNum = newNum - 10;
				newNum = newNum/1000;
			}
		}
		return newNum;
	}
}
