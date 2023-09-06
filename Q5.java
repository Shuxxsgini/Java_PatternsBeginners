/*Shubhangini 
 * Print the Pattern:
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5
 */
public class Q5 {

	public static void main(String[] args) {
		for(int r=1;r<=5;r++)
		{
			for(int c=5;c>=r;c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
