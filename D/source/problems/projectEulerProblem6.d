import std.stdio, std.math, std.conv;

void main(){
	real sumOfSquares, squareOfSum, difference;

	sumOfSquares = 0;
	squareOfSum = 0;
	for(int i = 1; i <= 100; i++){
		sumOfSquares += i * i;
		squareOfSum += i;
	}

	difference = (squareOfSum * squareOfSum) - sumOfSquares;
	writeln("Difference: ", to!int(difference));
}
