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

	public static boolean isDisvisibleBy (int dividend, int divisor) {
		if(dividend%divisor == 0) {
			return true;
		}else {
			return false;
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
		double newNum = rdNum * 100;
		double takeAwayNum = newNum % 1;
		if(newNum >= 0) {
			if(newNum%1 >= 0.5 ) {
				newNum = newNum + 1;
			}
			newNum = newNum - takeAwayNum;
		}else {
			if(takeAwayNum <= -0.5){
				newNum = newNum - 1;		
			}
			newNum = newNum - takeAwayNum;
		}
		newNum = newNum/100;
		return newNum;
	}
	
	public static double exponent (double val, int exp){
		double prod= 1;
		for(int i = 0; i < exp;i++) {
			prod = prod * val;
		}
		return prod;
	} 
	
	public static int factorial (int fac) {
		int val = 1;
		for(int i = 1; i <= fac; i++){
			val = val * i;
		}
		return val;
	}
	
	public static boolean isPrime (int chkPrmNum) {
		int currentGrtDivid = 1;
		if(chkPrmNum != 1) {
			for(int i = 1; i < chkPrmNum; i++){
				if(Calculate.isDisvisibleBy(chkPrmNum, i)) {
					if(i > currentGrtDivid) {
						currentGrtDivid = i;
					}
				}
			}
			if(currentGrtDivid == 1) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	/*public static int gcd (int aval, int bval) {
		int frstPrimeFac = 1;
		int secPrimeFac = 1;
		int thrdPrimeFac = 1;
		int grtCmnFac = 0;
		for(int i = 1; i < (int)Calculate.min(aval, bval); i++) {
			if(Calculate.isDisvisibleBy(aval, i) == true && Calculate.isDisvisibleBy(bval, i) == true){
				if(Calculate.isPrime(i) == true) {
					if(i > frstPrimeFac) {
						thrdPrimeFac = secPrimeFac;
						secPrimeFac = frstPrimeFac;
						frstPrimeFac = i;
					}
				}
			}
		//grtCmnFac = frstPrimeFac * secPrimeFac * thrdPrimeFac;
		}
		grtCmnFac = frstPrimeFac * secPrimeFac * thrdPrimeFac;
		return grtCmnFac;
	}*/	
	public static int gcd (int aval, int bval) {
		int crntGrtFac = 1;
		for (int i = 1; i <= (int)Calculate.min(aval, bval); i++){
			if(Calculate.isDisvisibleBy(aval, i) == true && Calculate.isDisvisibleBy(bval, i) == true) {
				if(i > crntGrtFac) {
					crntGrtFac = i;
				}
			}
		}
		return crntGrtFac;
	}
	
	public static double sqrt (double val2Sqrt) {
		
	}
}

