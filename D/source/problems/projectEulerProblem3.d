import std.stdio, std.math, std.array;
import utilities.sieveOfEratosthenes;

void main(){
	sieveOfErastothenes mySieve = new sieveOfErastothenes();
	//int largestPrimeFactor = 0;
	float numberToBeFactorized = 600851475143;
	int squareRootOfNumberToBeFactorized = cast(int)floor(sqrt(numberToBeFactorized));
	int[] primeBase = mySieve.primesLessThanN(squareRootOfNumberToBeFactorized + 1);
	int[] factors;

	writeln("Number: ", numberToBeFactorized, ", sqrt: ", squareRootOfNumberToBeFactorized, ", primebase: ", primeBase);

	for(int i = 0; i < primeBase.length; i++){
		if(numberToBeFactorized % primeBase[i] == 0){	
			factors ~= primeBase[i];
		}
	}
	//writeln(largestPrimeFactor);
	writeln(factors.back);
}
