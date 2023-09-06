/*Shubhangini
 * Print the pattern:
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
 */
public class Q8 {

	public static void main(String[] args) {
		 for(int r=1;r<=5;r++)
	      {
	         for(int c=5;c>=r;c--)
	            {
	               System.out.print(" ");
	            }
	          for(int k=1;k<=r;k++)
	          {
	        	  System.out.print(r+" ");
	          }
	          System.out.println();
	      }
	}
}
