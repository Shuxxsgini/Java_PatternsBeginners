/*Shubhangini
 * Print the pattern:
 * 1 
   2 1 
   3 2 1 
   4 3 2 1 
   5 4 3 2 1
 */
public class Q1 {

	public static void main(String[] args) {
		 for(int r=1;r<=5;r++)
	      {
	         for(int c=r;c>=1;c--)
	            {
	               System.out.print(c+" ");
	            }
	         System.out.println();
	      }
	}
}
