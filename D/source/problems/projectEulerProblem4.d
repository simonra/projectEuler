import std.stdio, std.conv, std.range;

void main(){
	double lowerLimit = 100 * 100;
	double upperLimit = 999 * 999;
	double largestKnownPalindrome = -1;
	double candidatePalindrome;
	string candidatePalindromeString;
	for(double i = 100; i <= 999; i++){
		for(double j = i; j <= 999; j++){
			candidatePalindrome = i * j;
			candidatePalindromeString = to!string(candidatePalindrome);
			if(candidatePalindromeString == candidatePalindromeString.retro.text){
				if(candidatePalindrome > largestKnownPalindrome) largestKnownPalindrome = candidatePalindrome;
			}
		}
	}
	writeln("Largest found palindrome was: ", largestKnownPalindrome);
}
