package projectEuler;



/*
	http://projecteuler.net/problem=28
	Problem:

	Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

	21 22 23 24 25
	20  7  8  9 10
	19  6  1  2 11
	18  5  4  3 12
	17 16 15 14 13

	It can be verified that the sum of the numbers on the diagonals is 101.

	What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
*/

//Solved
public class Problem028 {
	
	public long spiralDiagonalSum(int m){
		
//		Setter summen til en 1*1 spiral og senteret til å være 1
		long sum = 1;
		
//		Setter første n (som ikke brukes) til å være 1
		long n = 1;
//		int nMinus1 = 0;
		
		for (int i = 2; i < m; i += 2) {

//			regner ut første hjørne
			n += i;
			sum += n;
			
//			regner ut andre hjørne
			n += i;
			sum += n;
			
//			regner ut tredje hjørnet
			n += i;
			sum += n;

//			regner ut fjerde hjørnet
			n += i;
			sum += n;
		}
		
//		returnerer summen
		return sum;
	}
	
	
	public static void main(String[] args) {
		Problem028 p28 = new Problem028();
		System.out.println(p28.spiralDiagonalSum(1001));
		
//		Løsningen på en 1001 * 1001 spiral er 669171001

	}
}
