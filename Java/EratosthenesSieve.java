package projectEuler;

import java.util.ArrayList;

public class EratosthenesSieve {
	
	
	
	

	ArrayList<Integer> PrimesLessThanN(int n){
		
//		oppretter arraylisten som skal returneres
		ArrayList<Integer> primes = new ArrayList<Integer>();
//		oppretter arrayet med booleans som det jobbes med
		boolean[] array2 = new boolean[(int) (n + 1)];
		
//		setter alle indekser til true
		for (int i = 2; i <= n; i++) {
			array2[i] = true;
		}
		
		
//		setter indekser som ikke er primtall til false
		for (int i = 2; i*i <= n; i++) {
			if (array2[i]) {
				for (int j = i; i*j <= n; j++) {
					array2[i*j] = false;
				}
			}
		}

		
//		henter ut primtallene og legger dem i arraylisten
		for (int i = (int) 0; i < array2.length; i++) {
			if (array2[i]) {
				primes.add((int) i);
			}
		}
		
		
//		returnerer primtallene i en arraylist
		return primes;
	}
	
	
	
	
	
	
//	for testing:
	public static void main(String[] args) {
		EratosthenesSieve ers = new EratosthenesSieve();
//		System.out.println(ers.PrimesLessThanN(20));
		
//		System.out.println(ers.PrimesLessThanN((int) Math.floor(Math.sqrt(Float.parseFloat("600851475143")))));
//		ArrayList primes = ers.PrimesLessThanN(10);
//		for (int i = 0; i < primes.size(); i++) {
//			System.out.println(primes.get(i));
//		}
//		System.out.println(primes.get(0));
//		System.out.println(primes.get(1));
		
		
	}
	
	
	
	
}
