import std.stdio, std.algorithm, std.conv;
import utilities.sieveOfEratosthenes;
import utilities.primeFactorization;

void main(){
	//Initialize other classes
	sieveOfEratosthenes mySieve = new sieveOfEratosthenes();
	primeFactorization factorizationUtil = new primeFactorization();

	//variables
	real productOfFactorBase = 1;
	real[] primeBase = mySieve.primesLessThanN(20);
	real[] factorBase, factorsOfCurrentNumber;
	real numberOfTimesToAddPrime;
	
	/*Because 2 and 3 are inevitably going to be factors of other numbers less than 20
	one might as well start at 4 (same argument could be made for 6, but performance 
	is not that critical at this problem size).*/
	for(int i = 4; i <= 20; i++){
		factorsOfCurrentNumber = factorizationUtil.eratosthenesFactorization(i);
		foreach(prime; primeBase){
			if(factorBase.count(prime) < factorsOfCurrentNumber.count(prime)){
				numberOfTimesToAddPrime = factorsOfCurrentNumber.count(prime) - factorBase.count(prime);
				for(int j = 0; j < numberOfTimesToAddPrime; j++){
					factorBase ~= prime;
				}
			}
		}
	}
	//Compute the final number
	foreach(factor; factorBase){
		productOfFactorBase *= factor;
	}
	//Had to convert to int to not get scientiffic notation but whole number =(
	writeln("FactorBase is: ", factorBase);
	writeln("Smallest possible product: ", to!int(productOfFactorBase));
}
