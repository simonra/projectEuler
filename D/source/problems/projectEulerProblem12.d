import std.stdio, std.math, std.format;
import utilities.sieveOfEratosthenes;
import utilities.primeFactorization;

void main(){
	//real triangleNumber, numberOfDivisors;
	//for(real i = 8000; true; i++){
	//	triangleNumber = i*(i+1)/2;
	//	numberOfDivisors = 0;
	//	for(real j = 1; j <= triangleNumber / 2; j++){
	//		if(triangleNumber % j == 0){
	//			numberOfDivisors++;
	//		}
	//	}
	//	numberOfDivisors++; //is divisible with itself
	//	if (i % 2 == 0)
	//	writefln("Triangle number %g is %.20g, and has %g divisors", i, triangleNumber, numberOfDivisors);
	//	if(numberOfDivisors >= 500){
	//		break;
	//	}
	//}
	//writefln("The first triangle number with more than 500 divisors has %.20g number of divisors, it's: %.20g", numberOfDivisors, triangleNumber);

	sieveOfEratosthenes mySieve = new sieveOfEratosthenes();
	primeFactorization factorizationUtility = new primeFactorization();
	real currentTriangleNumber, lastTriangleNumber, secondLastTriangleNumber, solutionTriangleNumber;
	real currentNumberOfFactors, lastNumberOfFactors, secondLastNumberOfFactors, targetNumberOfFactors;
	real[] factors, primeFactors;

	lastTriangleNumber = 1;
	secondLastTriangleNumber = 0;
	lastNumberOfFactors = 1;
	secondLastNumberOfFactors = 0;
	targetNumberOfFactors = 500;

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
		//primeFactors = factorizationUtility.eratosthenesFactorization(triangle(currentTriangleNumber));
		//count the ammount of each prime factor
		//int[] numberOfEachFactor;
		//while(primeFactors)
		//use property that number of divisors = product of (number of occurences of each prime facotor + 1)
		//set currentNumberOfFactors

		real triangleNumber = currentTriangleNumber* (currentTriangleNumber + 1) /2;
		real numberOfDivisors = 0;
		for(real j = 1; j <= triangleNumber / 2; j++){
			if(triangleNumber % j == 0){
				numberOfDivisors++;
			}
		}
		numberOfDivisors++; //is divisible with itself
		currentNumberOfFactors = numberOfDivisors;
	}

	real triangle(real number){
		return number*(number + 1)/2;
	}

	bool targetReached(){
		if(currentTriangleNumber == lastTriangleNumber + 1){
			if(lastNumberOfFactors == targetNumberOfFactors - 1){
				if(currentTriangleNumber == targetNumberOfFactors){
					solutionTriangleNumber = currentTriangleNumber;
					return true;
				}
			}
		}else if(lastTriangleNumber == currentTriangleNumber + 1){
			if(currentNumberOfFactors == targetNumberOfFactors - 1){
				if(lastTriangleNumber == targetNumberOfFactors){
					solutionTriangleNumber = lastTriangleNumber;
					return true;
				}
			}
		}

		return false;
	}

	while(true){
		updateCurrentTriangleNumber();
		findFactorsOfCurrentTriangleNumber();
		//check whether one is done
		if(targetReached()){
			break;
		}

		//update second last and last
		secondLastTriangleNumber = lastTriangleNumber;
		secondLastNumberOfFactors = lastNumberOfFactors;
		lastTriangleNumber = currentTriangleNumber;
		lastNumberOfFactors = currentNumberOfFactors;
		writefln("Triangle number %g is %.20g, and has %g divisors", currentTriangleNumber, triangle(currentTriangleNumber), currentNumberOfFactors);
	}

	writefln("The first triangle number with more than 500 divisors is: %.20g", triangle(solutionTriangleNumber));

}
