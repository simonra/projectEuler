module utilities.primeFactorization;

import std.math, std.array;
import utilities.sieveOfEratosthenes;

public class primeFactorization {

	real[] eratosthenesFactorization(real n){
		//Initialize sieveclass
		sieveOfEratosthenes mySieve = new sieveOfEratosthenes();
		//Variables
		real numberToBeFactorized, currentFactor;
		real[] primes, factors;
		real primeSizeLimit = 512;
		numberToBeFactorized = 600851475143;
		currentFactor = 1;
	
		//Make initial pool of primes to check against
		primes = mySieve.primesLessThanN(primeSizeLimit);
	
		//Begin iterating
		for(int i = 0; i < primes.length; i++){
			currentFactor = primes[i];
			//Check if the i-th prime is a factor
			if(numberToBeFactorized % currentFactor == 0) {
				//If so, append it to the list of known factors
				factors ~= currentFactor;
				//Make the number one's trying to factorize to the largest known factor (reduces problem size massively)
				numberToBeFactorized = numberToBeFactorized / currentFactor;
				//If the larges known factor now is 1 stop the trying
				if(numberToBeFactorized == 1) break;
				//Check the i-th prime against the new factor again, to see if it is a factor more than once
				i--;
			}
			/*If one has exhaused the current set of primes,
			but isn't confident that the problem is solved,
			increase the size of the set of primes one tests,
			and restart the looping*/
			if(i == primes.length - 1) {
				if(numberToBeFactorized > primeSizeLimit){
					primeSizeLimit = primeSizeLimit + primeSizeLimit;
					primes = mySieve.primesLessThanN(primeSizeLimit);
					i = -1;
				}
			}
		}
		return factors;
	}
}
