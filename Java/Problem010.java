package projectEuler;

/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.*/


//			Solved
public class Problem010 {
	
	double productOfNFirstPrimes(int n){
		double product = 0;
		EratosthenesSieve2 sieve = new EratosthenesSieve2();
		for (Float prime : sieve.PrimesLessThanN(n)) {
			product += prime;
		}
		
		
		return product;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Problem010 p10 = new Problem010();
		System.out.println(p10.productOfNFirstPrimes(2000000));
	}
}
