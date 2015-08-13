package projectEuler;


/*
	http://projecteuler.net/problem=6

	Problem:
	The sum of the squares of the first ten natural numbers is,

	12 + 22 + ... + 102 = 385
	The square of the sum of the first ten natural numbers is,

	(1 + 2 + ... + 10)2 = 552 = 3025
	Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.

	Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/


//			Solved
public class Problem006 {
	
	
	double sumOfSquares(int i){
		double sum = 1;
		for (int j = 2; j <= i; j++) {
			sum += Math.pow(j, 2);
		}
		return sum;
	}
	
	double squareOfSum(int i){
		double sum = 0;
		for (int j = 1; j <= i; j++) {
			sum += j;
		}
		sum = Math.pow(sum, 2);
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		Problem006 p6 = new Problem006();
		System.out.println(p6.squareOfSum(100) - p6.sumOfSquares(100));
	}
	
	
	
	
}
