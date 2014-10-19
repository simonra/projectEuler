import std.stdio, std.math, std.format;

void main(){
	real triangleNumber, numberOfDivisors;
	for(real i = 0; true; i++){
		triangleNumber = i*(i+1)/2;
		numberOfDivisors = 0;
		/*This improvements make the brute-force approach viable. Because there for every divisor below the square root is a corresponding divisor above the square root, we can multiply by two. This is signifficantly better than the divide by two approach which had to iterate through all the divisors as opposed to this itterating only through half of the divisors.*/
		for(real j = 1; j <= sqrt(triangleNumber); j++){
			if(triangleNumber % j == 0){
				numberOfDivisors += 2;
			}
		}

		if(numberOfDivisors >= 500){
			break;
		}
	}
	writefln("The first triangle number with more than 500 divisors has %.20g number of divisors, it's: %.20g", numberOfDivisors, triangleNumber);
}
