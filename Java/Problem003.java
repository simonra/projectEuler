package projectEuler;

//import java.math.float;
import java.util.ArrayList;

/*
http://projecteuler.net/problem=3

Problem:
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/


//			Solved
public class Problem003 {
	
	
	ArrayList<Integer> factorize(Double n){
		
		int sqrt = (int) Math.floor(Math.sqrt(n));
		ArrayList<Integer> factors = new ArrayList<Integer>();
		EratosthenesSieve ES = new EratosthenesSieve();
		ArrayList<Integer> primesLessThanN = ES.PrimesLessThanN(sqrt);
		
		for (int i = 0; i < primesLessThanN.size(); i++) {
			if ( (n % primesLessThanN.get(i) == 0 ) ) {
				factors.add(primesLessThanN.get(i));
			}
		}
		
		
		
		
		
		return factors;
	}
	
	
	
	public static void main(String[] args) {
		
		Problem003 p3 = new Problem003();
		System.out.println(p3.factorize(Double.parseDouble("600851475143")));
//		System.out.println(p3.factorize(Float.parseFloat("600851480000")));
//		System.out.println(p3.factorize(Double.parseDouble("906609")));
	}
	
	
	
	
}