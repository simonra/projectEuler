package projectEuler;

/*
	http://projecteuler.net/problem=1
	
 	Problem:
 	If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

	Find the sum of all the multiples of 3 or 5 below 1000.
 */



//solved
public class Problem001 {
	
	int sumOfMultiplesOfNBelowM(int n, int m){
		int sum = 0;
		
		double MaxMultiplier = Math.floor(m/n) + 1;
		
		for (int i = 0; i < MaxMultiplier; i++) {
			sum += (n*i);
		}
		
		
		return sum;
	}
	
	
	
	int sumOfMultiplesOfNAndMBelowK(int n, int m, int k){
		int sum = 0;
		int MaxMultiplierNM = (int) Math.floor(k/(n*m)) + 1;
		
		for (int i = 0; i < MaxMultiplierNM; i++) {
			sum += n*m*i;
		}
				
		return sum;
	}
	
	
	
	
	public static void main(String[] args) {
		Problem001 p1 = new Problem001();
		System.out.println(p1.sumOfMultiplesOfNBelowM(3, 1000) + p1.sumOfMultiplesOfNBelowM(5, 1000) - p1.sumOfMultiplesOfNAndMBelowK(3, 5, 1000));

//		Løsningen er 233168
	}
	
}
