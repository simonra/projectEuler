package projectEuler;

/*If the numbers 1 to 5 are written out in words: one, two, three, four, five, 
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, 
how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) 
contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of 
"and" when writing out numbers is in compliance with British usage.*/

//			Solved
public class Problem017 {
	
	
	int findNumberOfWordsInNumbersUpToN(int n){
		
		String numbers = "";
		
		for (int i = 0; i <= n; i++) {
			numbers += integerToWord(i);
		}
		
		int counter = 0;
		
		for (int i = 0; i < numbers.length(); i++) {
			if(numbers.charAt(i) != ' '){
				counter ++;
			}
		}
		
//		System.out.println(numbers);
		
		return counter;
	}
	
	String integerToWord(int n){
		if(n < 10){
			if(n == 0){
				return "";
			}if(n == 1){
				return "one";
			}if(n == 2){
				return "two";
			}if(n == 3){
				return "three";
			}if(n == 4){
				return "four";
			}if(n == 5){
				return "five";
			}if(n == 6){
				return "six";
			}if(n == 7){
				return "seven";
			}if(n == 8){
				return "eight";
			}if(n == 9){
				return "nine";
			}
		}
		
		if(n == 10){
			return "ten";
		}

		if(n == 11){
			return "eleven";
		}if(n == 12){
			return "twelve";
		}if(n == 13){
			return "thirteen";
		}if(n == 14){
			return "fourteen";
		}if(n == 15){
			return "fiteen";
		}if(n == 16){
			return "sixteen";
		}if(n == 17){
			return "seventeen";
		}if(n == 18){
			return "eightteen";
		}if(n == 19){
			return "nineteen";
		}
		
		if(n < 30 && n >= 20){
			return "twenty" + integerToWord(n - 20);
		}if(n < 40 && n >= 30){
			return "thirty" + integerToWord(n - 30);
		}if(n < 50 && n >= 40){
			return "forty" + integerToWord(n - 40);
		}if(n < 60 && n >= 50){
			return "fifty" + integerToWord(n - 50);
		}if(n < 70 && n >= 60){
			return "sixty" + integerToWord(n - 60);
		}if(n < 80 && n >= 70){
			return "seventy" + integerToWord(n - 70);
		}if(n < 90 && n >= 80){
			return "eighty" + integerToWord(n - 80);
		}if(n < 100 && n >= 90){
			return "ninety" + integerToWord(n - 90);
		}
		
		if(n == 100){
			return "one hundred";
		}if(n == 200){
			return "two hundred";
		}if(n == 300){
			return "three hundred";
		}if(n == 400){
			return "four hundred";
		}if(n == 500){
			return "five hundred";
		}if(n == 600){
			return "six hundred";
		}if(n == 700){
			return "seven hundred";
		}if(n == 800){
			return "eight hundred";
		}if(n == 900){
			return "nine hundred";
		}
		
		if(n < 200 && n > 100){
			return "one hundred and " + integerToWord(n - 100);
		}if(n < 300 && n > 200){
			return "two hundred and " + integerToWord(n - 200);
		}if(n < 400 && n > 300){
			return "three hundred and " + integerToWord(n - 300);
		}if(n < 500 && n > 400){
			return "four hundred and " + integerToWord(n - 400);
		}if(n < 600 && n > 500){
			return "five hundred and " + integerToWord(n - 500);
		}if(n < 700 && n > 600){
			return "six hundred and " + integerToWord(n - 600);
		}if(n < 800 && n > 700){
			return "seven hundred and " + integerToWord(n - 700);
		}if(n < 900 && n > 800){
			return "eight hundred and " + integerToWord(n - 800);
		}if(n < 1000 && n > 900){
			return "nine hundred and " + integerToWord(n - 900);
		}
		
		if(n == 1000){
			return "one thousand";
		}
		
		
		return "";
	}
	
	
	public static void main(String[] args) {
		Problem017 p17 = new Problem017();
		
		System.out.println(p17.findNumberOfWordsInNumbersUpToN(1000));
		
//		System.out.println(Integer.toString(20, 20));
	}
}
