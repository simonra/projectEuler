package projectEuler;

import java.math.BigInteger;

/*The following iterative sequence is defined for the set of positive integers:

n -> n/2 (n is even)
n -> 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. (inkludert 13 og 1)
Although it has not been proved yet (Collatz Problem), it is thought that all starting 
numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.*/


//			Solved
public class Problem014 {
	
	
	int startingNumberGivingLongestCollatzChain(int maxStart){
		BigInteger currentNumberInChain = BigInteger.valueOf(0);
		int numberOfNumbersInChain = 0;
		int largestChainSoFar = 0;
		int startingNumberOfLargestChain = 0;
		boolean b = true;
		BigInteger zero = BigInteger.valueOf(0);
		BigInteger one = BigInteger.valueOf(1);
		BigInteger two = BigInteger.valueOf(2);
		BigInteger three = BigInteger.valueOf(3);
		
		for (int i = 1; i < maxStart; i++) {
			currentNumberInChain = BigInteger.valueOf(i);
			numberOfNumbersInChain = 0;
			b = true;
			while(b){
				if(currentNumberInChain.equals(one)){
					numberOfNumbersInChain++;
					b = false;
				}else if(currentNumberInChain.mod(two).equals(zero)){
					currentNumberInChain = currentNumberInChain.divide(two);
					numberOfNumbersInChain++;
				}else {
					currentNumberInChain = (currentNumberInChain.multiply(three)).add(one);
					numberOfNumbersInChain++;
				}
			}
			if(numberOfNumbersInChain > largestChainSoFar){
				largestChainSoFar = numberOfNumbersInChain;
				startingNumberOfLargestChain = i;
			}
		}
		
		
		
		return startingNumberOfLargestChain;
	}
	
	
	
	public static void main(String[] args) {
		Problem014 p14 = new Problem014();
		
		System.out.println(p14.startingNumberGivingLongestCollatzChain(1000000));
	}
}

















