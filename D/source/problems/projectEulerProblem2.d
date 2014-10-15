import std.stdio;

void main(){
	int sum = 0;
	int previousFib = 0;
	int currentFib = 1;
	int nextFib = -1;
	while(nextFib < 4000000){
		nextFib = previousFib + currentFib;
		previousFib = currentFib;
		currentFib = nextFib;
		if(currentFib % 2 == 0){
			sum += currentFib;
		}
	}
	writeln(sum);
}
