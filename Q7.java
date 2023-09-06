/*Shubhangini
 * Print the pattern:
5 
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5 
 * 
 */
public class Q7 {

	public static void main(String[] args) {
		for(int r=5;r>=1;r--)
		{
			for(int c=r;c<=5;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
