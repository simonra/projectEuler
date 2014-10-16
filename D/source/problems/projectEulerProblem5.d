import std.stdio, std.algorithm;
import utilities.sieveOfEratosthenes;
import utilities.primeFactorization;

void main(){
	sieveOfEratosthenes mySieve = new sieveOfEratosthenes();
	primeFactorization factorizationUtil = new primeFactorization();

	real productOfFactorBase = 1;
	real[] primeBase = mySieve.primesLessThanN(20);
	real[] factorBase, factorsOfCurrentNumbers;
	real numberOfTimesToAddPrime;
	
	for(int i = 4; i <= 20; i++){
		factorsOfCurrentNumbers = factorizationUtil.eratosthenesFactorization(i);
		foreach(prime; primeBase){
			if(factorBase.count(prime) < factorsOfCurrentNumbers.count(prime)){
				numberOfTimesToAddPrime = factorsOfCurrentNumbers.count(prime) - factorBase.count(prime);
				for(int j = 0; j < numberOfTimesToAddPrime; j++){
					factorBase ~= prime;
				}
			}
		}
	}
	foreach(factor; factorBase){
		productOfFactorBase *= factor;
	}
	writeln("Smallest possible product: ", productOfFactorBase);
}
