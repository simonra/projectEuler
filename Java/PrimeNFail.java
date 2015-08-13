package projectEuler;




// basert på http://functions.wolfram.com/NumberTheoryFunctions/Prime/06/01/0003/ 
// som ser ut til å ha veldig lite for seg...

public class PrimeNFail {
	
	
	public int primeN(int n){
		int prime = 0;
		
		
		int sumM = 0;
		int sumK = 0;
		int sumI1 = 0;
		int sumI2 = 0;
		
		
		for (int m = 2; m < Math.pow(2, n) + 1; m++) {
			
//			finner sum i1 for denne iterasjonen av sum m
			for (int i1 = 1; i1 < m; i1++) {
				sumI1 += (int) Math.floor( (int) Math.floor(m/i1) / ( m / i1) );
			}
			
			
//			finner sum k for denne iterasjonen av sum m
			for (int k = 2; k < m+1; k++) {
				
//				finner sum i2 for denne iterasjonen av sum m
				for (int i2 = 1; i2 < k; i2++) {
					sumI2 += (int)Math.floor( (int)Math.floor(k/i2) / (k/i2) );
				}
				
				sumK += (int)Math.floor(1 / sumI2);
				sumI2 = 0;
			}
			
			
			
			sumM += m * (int)Math.floor(1 / ( 1 + (int)Math.abs( n - (int)Math.floor( 1 / sumI1) * sumK ) ) );
			
			System.out.println("sum i1 " + sumI1);
			System.out.println("sum i2 " + sumI2);
			System.out.println("sum k " + sumK);
			System.out.println("sum m " + sumM);
			System.out.println("summen dette leddet " + m * (int)Math.floor(1 / ( 1 + (int)Math.abs( n - (int)Math.floor( 1 / sumI1) * sumK ) ) ));
			
			System.out.println(Math.abs( n - (int)Math.floor( 1 / sumI1) * sumK ));
			
//			Nullstiller delsummene for hver iterasjon av storsummen
			sumI1 = 0;
			sumI2 = 0;
			sumK  = 0;
		}
		

		prime = sumM;
		return prime;
	}
	
	
	
	
	public static void main(String[] args) {
		PrimeNFail pn = new PrimeNFail();
		System.out.println(pn.primeN(5));
	}
	
}
