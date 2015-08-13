package projectEuler;

import java.util.ArrayList;

public class EratosthenesSieve2 {
	
	
	
	

	ArrayList<Float> PrimesLessThanN(float n){
		
//		oppretter arraylisten som skal returneres
		ArrayList<Float> primes = new ArrayList<Float>();
//		oppretter arrayet med booleans som det jobbes med
//		boolean[] array2 = new boolean[(int) (n + 1)];
		ArrayList<Boolean> array2 = new ArrayList<Boolean>();
		
		array2.add(false);
		array2.add(false);
//		setter alle indekser til true
		for (int i = 2; i <= n; i++) {
			array2.add(i, true);
		}
		
		
//		setter indekser som ikke er primtall til false
		for (int i = 2; i*i <= n; i++) {
			if (array2.get(i)) {
				for (int j = i; i*j <= n; j++) {
					array2.set(i*j, false);
				}
			}
		}

		
//		henter ut primtallene og legger dem i arraylisten
		for (int i = (int) 0; i < array2.size(); i++) {
			if (array2.get(i)) {
				primes.add((float) i);
			}
		}
		
		
//		returnerer primtallene i en arraylist
		return primes;
	}
	
	
	
	
	
	
////	for testing:
//	public static void main(String[] args) {
//		EratosthenesSieve ers = new EratosthenesSieve();
//		System.out.println(ers.PrimesLessThanN(10000));
//		ArrayList primes = ers.PrimesLessThanN(10);
////		for (int i = 0; i < primes.size(); i++) {
////			System.out.println(primes.get(i));
////		}
////		System.out.println(primes.get(0));
////		System.out.println(primes.get(1));
//	}
//	
	
	
	
}
