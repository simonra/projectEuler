package projectEuler;


/*Starting in the top left corner of a 22 grid, and only
 *  being able to move to the right and down, there are 
 *  exactly 6 routes to the bottom right corner.


 How many such routes are there through a 20 X 20 grid?*/

//En løsning er (n*2)nCr(n)

//			Solved
public class Problem015 {
	
	double pathsDownToTheRightSquareSheet(int size){
		/*There are 20 ways to go down in this problem, and 20 to go right. 
		 * Of these 40 alternatives you must choose 20 to get to the lower right 
		 * corner (from the upper left). Hence the problem is reduced to finding 
		 * 2*the size nCr the size.*/
		
		
		OfNChooseR nCr = new OfNChooseR();
		return nCr.nCr(2*size, size);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Problem015 p15 = new Problem015();
		
		System.out.println(p15.pathsDownToTheRightSquareSheet(20));
	}
	
	
}




















