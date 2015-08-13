package projectEuler;


/*
	http://projecteuler.net/problem=7

	Problem:
	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

	What is the 10 001st prime number?
*/

//			Solved
public class Problem007 {
	
	public static void main(String[] args) {
		EratosthenesSieve ES = new EratosthenesSieve();
		System.out.println(         ES.PrimesLessThanN(    (int) Math.floor(Math.sqrt(Float.parseFloat("600851475143")))    ).get(10000)         );
	}
	
	
	
	
	
	
	
}
