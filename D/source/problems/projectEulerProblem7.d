import std.stdio, std.conv;
import utilities.sieveOfEratosthenes;

void main(){
	sieveOfEratosthenes mySieve = new sieveOfEratosthenes();
	real[] primes;
	real targetPrime = 10001;
	real sieveSize = 100000;
	bool primeFound = false;

	while(!primeFound){
		primes = mySieve.primesLessThanN(sieveSize);
		if(primes.length >= targetPrime){
			primeFound = true;
		}
		sieveSize *= 2;
	}

	writeln("Prime number ", targetPrime, " was found to be: ", to!int(primes[to!ulong(targetPrime - 1)]));
}
