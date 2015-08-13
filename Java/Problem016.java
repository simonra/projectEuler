package projectEuler;

import java.math.BigInteger;

/*2 ^ 15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2 ^ 1000?*/

//			Solved
public class Problem016 {

	
	
	public static void main(String[] args) {
//		Problem016 p16 = new Problem016();
		BigInteger power = BigInteger.ONE;
		BigInteger two = BigInteger.valueOf(2);
		for (int i = 0; i < 1000; i++) {
//			BigInteger I = BigInteger.valueOf(i);
			power = power.multiply(two);
//			System.out.println(power);
		}
		String humongousInteger = ""+ power;
		int sum = 0;
		for (int i = 0; i < humongousInteger.length(); i++) {
			sum += Integer.parseInt(""+humongousInteger.charAt(i));
			
		}
		System.out.println(sum);
	}
}






