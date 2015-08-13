package projectEuler;

import java.util.ArrayList;



/*
http://projecteuler.net/problem=4

Problem:
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

//				Solved
public class Problem004 {
	
	
//	Splitter strengen du sender inn i enten to eller tre, avhengig av hvor lang strengen er
	ArrayList<String> splitString(String s){
		ArrayList<String> strings = new ArrayList<String>();
		
//		finner mid og caster s.length til double for at divisjonen skal gi desimaltall. Desimaltall trengs for å avgjøre om tallet er like eller odde.
		double mid = (double)s.length() / 2;
		
		boolean even = mid == Math.floor(mid);
		if (even) {
			strings.add(s.substring(0,(int) mid));
			strings.add(s.substring((int) mid));
		}else{
			int mid2 = (int) Math.floor(mid);
			strings.add(s.substring(0, mid2));
			strings.add(s.substring(mid2, mid2 + 1));
			strings.add(s.substring(mid2 + 1));
		}
		
		
		return strings;
	}
	
	
	
//	reverserer strenger
	String reverse(String s) {
	    return new StringBuffer(s).reverse().toString();
	}
	
	
	
//	finner ut om noe er et palindrom
	boolean determineIfPalindrome(int i){
		String s = "" + i;
		ArrayList<String> split = splitString(s);
		
		if (split.size() == 2) {
			if (split.get(0).equals(reverse(split.get(1)))) {
				return true;
			}
		}else if (split.get(0).equals(reverse(split.get(2)))) {
			return true;
		}
		
		return false;
	}
	
	
	
	int findLargestPalindromeNotExeedingN(int n){
//		System.out.println(n);
		int largest = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				if (determineIfPalindrome(i*j) && i*j>largest) {
					largest = i*j;
			}
//			System.out.println("is this ever run?");
//			largest ++;
//				return largest;
			}
		}
		
		return largest;
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Problem004 p4 = new Problem004();
//		System.out.println(p4.splitString("1234"));
//		System.out.println(p4.determineIfPalindrome(997799));
		System.out.println(p4.findLargestPalindromeNotExeedingN(1000));
	}
	
	
	
}
