package projectEuler;

public class FindPrimeN {
	public double primeN(double n){
		
		double prime = 0;
		
		double sumK = 0;
		double sumJ = 0;
		double sumI = 0;
		
		double sumKMN1 = 0;
		double sumKMN2 = 0;
		
		for (double  k = 2; k < Math.floor( (2 * n * Math.log(n)) + 2 ) + 1; k++) {
			
//			sumJ
			for (double j = 2; j < k + 1; j++) {

//				sumI
				for (double i = 1; i < j + 1; i++) {
					sumI += (Math.floor( j / i ) - Math.floor( ( j - 1 ) / i ));
				}
				
//				System.out.println(sumI);
				
				sumJ += Math.floor( ( 2 - sumI ) / j ) + 1;
				
				sumI = 0;
			}
			
//			sumK
			sumK += (1 - Math.floor(sumJ/n));
			
//			System.out.println("sum i " + sumI);
//			System.out.println("sum j " + sumJ);
			System.out.println("sum k " + sumK);
//			System.out.println(" ");
			
			sumKMN2 = sumKMN1;
			sumKMN1 = sumK;
			
			if (sumK == sumKMN1 && sumK == sumKMN2) {
				break;
			}
			
//			nullstiller undersummene
			sumJ = 0;
			sumI = 0;
			
		}
		
		
		prime = 2 + sumK;
		
		return prime;
	}
	
	
	
	public static void main(String[] args) {
		FindPrimeN fpn = new FindPrimeN();
		System.out.println(fpn.primeN(1000));
		
//		System.out.println((1/10) * 3 + " " + 3/10);
	}
	
	
	
	
	
}
