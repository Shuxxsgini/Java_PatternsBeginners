/*Shubhangini
 * Print the Pattern:
 * 
 */
public class Q10 {
	
	    public static void main(String[] args) {
	        int n = 5;
	        
	        for (int i = 0; i <= n; i++) {
	            for (int j = 0; j < i * 2; j++) {
	                System.out.print(" ");
	            }
	            for (int j = n - i; j >= 0; j--) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	    }
	}