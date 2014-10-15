import std.stdio, std.math, std.array, std.algorithm;

class sieveOfErastothenes {

	int[] primesLessThanN(int n){
		int[] primesLessThanN, candidateNumbers;
		int currentPrime;
		long indexOfI;

		//Populate with all the numbers less than N
		primesLessThanN ~= 2;
		for(int i = 3; i < n; i += 2 ){
			candidateNumbers ~= i;
		}

		//Iterate over possible primes untill there are no more possibilities
		while(candidateNumbers.length > 0){
			currentPrime = candidateNumbers.front;
			primesLessThanN ~= currentPrime;
			candidateNumbers.popFront();

			/*Remove all remaining multiples of the current prime.
			Because all smaller composite numbers have been removed,
			it's safe to start with the square of the current prime.
			Also because there are no even numbers at this point, it's
			safe to do 2*currentPrime, skipping the evens.*/
			for(int i = currentPrime * currentPrime; i < n; i += 2*currentPrime){
				indexOfI = candidateNumbers.countUntil(i);
				//Composite with smaller prime, therefore already removed, continue to next iteration
				if(indexOfI == -1) continue;
				candidateNumbers = candidateNumbers[0 .. indexOfI] ~ candidateNumbers[indexOfI + 1 .. $];
			}
		}
		return primesLessThanN;
	}
}
/*
//Testcode
void main(){
	sieveOfErastothenes mySieve = new sieveOfErastothenes();
	int[] primes = mySieve.primesLessThanN(20000);
	writeln(primes);
	writeln(primes.length);
}
*/
