import std.stdio, std.math;
import utilities.sieveOfEratosthenes;
import utilities.primeFactorization;

void main(){
	sieveOfEratosthenes mySieve = new sieveOfEratosthenes();
	primeFactorization factorizationUtility = new primeFactorization();
	real currentTriangleNumber, lastTriangleNumber, secondLastTriangleNumber;
	real currentNumberOfFactors, lastNumberOfFactors, secondLastNumberOfFactors, targetNumberOfFactors;
	real[] factors, primeFactors;

	lastTriangleNumber = 1;
	secondLastTriangleNumber = 0;
	lastNumberOfFactors = 1;
	secondLastNumberOfFactors = 0;

	while(true){
		updateCurrentTriangleNumber();
		findFactorsOfCurrentTriangleNumber();
		//check whether one is done
		//update second last and last
		//next iteration
	}

	void updateCurrentTriangleNumber(){
		//We are too low
		if(lastNumberOfFactors < targetNumberOfFactors){
			//Were we previously too low?
			if(secondLastNumberOfFactors < targetNumberOfFactors){
				currentTriangleNumber = lastTriangleNumber * 2;
			}
			//Or were we previously too high?
			else{
				currentTriangleNumber = lastTriangleNumber + floor((secondLastTriangleNumber - lastTriangleNumber)/2);
			}
		}
		//We are too high
		else{
			//Were we previously too low?
			if(secondLastNumberOfFactors < targetNumberOfFactors){
				currentTriangleNumber = secondLastTriangleNumber + floor((lastTriangleNumber - secondLastTriangleNumber)/2);
			}
			//Or were we previously too high?
			else{
				currentTriangleNumber = lastTriangleNumber / 2;
			}
		}
	}

	void findFactorsOfCurrentTriangleNumber(){
		primeFactors = factorizationUtility.eratosthenesFactorization(triangle(currentTriangleNumber));
		//count the ammount of each prime factor
		//use property that number of divisors = product of (number of occurences of each prime facotor + 1)
		//set currentNumberOfFactors
	}

	real triangle(real number){
		return number*(number + 1)/2;
	}

}
