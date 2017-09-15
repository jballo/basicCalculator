/*Jonathan Ballona
 * September 6, 2017
 * This is the runner for the calculate library. It is used to test the method in ___
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(-7));
		System.out.println(Calculate.cube(-3));
		System.out.println(Calculate.average(6,5));
		System.out.println(Calculate.average(4, 6, 9));
		System.out.println(Calculate.toDegrees(-3));
		System.out.println(Calculate.toRadians(79));
		System.out.println(Calculate.discriminant(4, 6, 9));
		System.out.println(Calculate.toImproperFrac(9, 6, 2));
		System.out.println(Calculate.toMixed(9, 2));
		System.out.println(Calculate.foil(3, 6, 7, 2, "n"));
		System.out.println(Calculate.isDisvisibleBy(6, 4));
		System.out.println(Calculate.absValue(-3.17));
		System.out.println(Calculate.max(-9.731, 9.01));
		System.out.println(Calculate.max(7.2, -0.01, 10));
		System.out.println(Calculate.min(6, 9));
		System.out.println(Calculate.round2(2.77687));
		
	}
}