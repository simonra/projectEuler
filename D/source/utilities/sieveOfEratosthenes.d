module utilities.sieveOfEratosthenes;
import std.stdio, std.math, std.array, std.algorithm, std.container;

public class sieveOfEratosthenes {

	real[] primesLessThanN(real n){
		real[] primesLessThanN;
		bool[] possiblePrimes;
		ulong indexOfCurrentPrime = 3;
		bool isNumberOdd = true;

		if(n <= 2) return primesLessThanN;

		//Append the values for 0, 1, and 2
		possiblePrimes ~= false;
		possiblePrimes ~= false;
		possiblePrimes ~= true;
		//Start populating the array
		for(real i = 3; i < n; i ++){
			if(isNumberOdd){
				possiblePrimes ~= true;
				isNumberOdd = false;
			}
			else{
				possiblePrimes ~= false;
				isNumberOdd = true;
			}
		}

		while(true){
			/*Mark all remaining multiples of the current prime.
			Because all smaller composite numbers have been marked,
			it's safe to start with the square of the current prime.
			Also because all even numbers have been marked at this
			point, it's safe to do 2*indexOfCurrentPrime, skipping
			the evens.*/
			for(ulong i = indexOfCurrentPrime * indexOfCurrentPrime; i < n; i += 2*indexOfCurrentPrime){
				possiblePrimes[i] = false;
			}
			/*When having hit halfways there can be no higher
			composite numbers that havent been ruled out, so
			one can stop at this point.*/
			if(indexOfCurrentPrime >= n/2){
				break;
			}

			/*Increment to the next number so we don't get stuck,
			also only check every other number because evens.*/
			indexOfCurrentPrime += 2;
			while(!possiblePrimes[indexOfCurrentPrime]){
				indexOfCurrentPrime += 2;
			}

		}

		primesLessThanN ~= 2;
		for(ulong i = 3; i < n; i += 2){
			if(possiblePrimes[i]){
				primesLessThanN ~= i;
			}
		}


		return primesLessThanN;
	}
}
/*
//Testcode
void main(){
	sieveOfEratosthenes mySieve = new sieveOfEratosthenes();
	real[] primes = mySieve.primesLessThanN(1);
	//writeln(primes);
	writeln(primes.length);
}
*/
