package projectEuler;

import java.util.ArrayList;



/*
	http://projecteuler.net/problem=5

	Probelm:
	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

//			Solved
public class Problem005 {
	
	
	
//	Løsning: Det største antallet faktorer av ett primtall fra et av tallene blir mengden faktorer av det primtallet i sluttproduktet.
//	Løsningen er derfor 2^4*3^2*5*7*11*13*17*19 = 232792560
	
	
	
	
	
	
	
	
//	Ved programmering:
	
	int smallestNumberEvenlyDivisibleByAllNumbersFrom1ToN(int n){
		int number = 1;
		EratosthenesSieve ES = new EratosthenesSieve();
		ArrayList<Integer> factors = ES.PrimesLessThanN(n);
		for (int i = 0; i < factors.size(); i++) {
			int j = 0;
			while( Math.pow(factors.get(i),j) < n ){
				j++;
			}
			System.out.println(j);
			number *= Math.pow(factors.get(i), j-1);	
		}
		
		
		return number;
	}
	
	public static void main(String[] args) {
		Problem005 p5 = new Problem005();
		System.out.println(p5.smallestNumberEvenlyDivisibleByAllNumbersFrom1ToN(20));
	}
	
	
	
}
