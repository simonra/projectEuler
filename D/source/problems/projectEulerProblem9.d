import std.stdio, std.format;

void main(){
	//find abc where a<b<c, a²+b²=c², and a + b + c = 1000 (and all are natural numbers)
	//Find product of a*b*c

	for(int a = 1; a < 998; a++){
		for(int b = a + 1; b < 999; b++){
			for(int c = b + 1; c < 1000; c++){
				if(a + b + c == 1000){
					if(a*a + b*b == c*c){
						writefln("The product of the pythagorean triplet %d, %d, %d is: %d", a, b, c, a*b*c);
						return;
					}
				}
			}
		}
	}
}
