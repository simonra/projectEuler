import std.stdio, std.math, std.array;
import utilities.sieveOfEratosthenes;

void main(){
	sieveOfErastothenes mySieve = new sieveOfErastothenes();
	real numberToBeFactorized, currentFactor;
	real[] primes, factors;
	real primeSizeLimit = 512;
	numberToBeFactorized = 600851475143;
	currentFactor = 1;
	primes = mySieve.primesLessThanN(primeSizeLimit);
	for(int i = 0; i < primes.length; i++){
		currentFactor = primes[i];
		if(numberToBeFactorized % currentFactor == 0) {
			factors ~= currentFactor;
			numberToBeFactorized = numberToBeFactorized / currentFactor;
			if(numberToBeFactorized == 1) break;
			i--;
		}
		if(i == primes.length - 1) {
			if(numberToBeFactorized > primeSizeLimit){
				i = -1;
				primeSizeLimit = primeSizeLimit + primeSizeLimit;
				primes = mySieve.primesLessThanN(primeSizeLimit);
			}
		}
	}

	writeln("Factors: ", factors);
	writeln("Largest factor: ", factors.back);
}
