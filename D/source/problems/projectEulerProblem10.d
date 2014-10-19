import std.stdio, std.algorithm, std.format;
import utilities.sieveOfEratosthenes;

void main(){
	sieveOfEratosthenes mySieve = new sieveOfEratosthenes();

	real[] primesBelow2m;
	real sumOfPrimesBelow2m;

	primesBelow2m = mySieve.primesLessThanN(2000000);
	sumOfPrimesBelow2m = reduce!((a, b) => a + b)(primesBelow2m);

	writefln("The sum of primes below 2 million is: %.20g", sumOfPrimesBelow2m);

}
