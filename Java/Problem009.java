package projectEuler;


/*A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/

//			Solved
public class Problem009 {
	
	
	
	int productOfPythagoreanTripletThatEqualsN(int n){
		
		for (int a = 1; a < n; a++) {
			for (int b = 1; b < n; b++) {
				for (int c = 1; c < n; c++) {
					if(a + b + c == n && a*a + b*b == c*c){
							return a*b*c;							
					}
				}
			}
		}
		return -1;
	}
	

	
	public static void main(String[] args) {
		Problem009 p9 = new Problem009();
		
		System.out.println(p9.productOfPythagoreanTripletThatEqualsN(1000));
	}
}
