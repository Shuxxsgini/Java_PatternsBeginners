/*Shubhangini
* Print the patterns:
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1
*/
public class Q4 {

	public static void main(String[] args) {
		for (int r=5;r>=1;r--)
		{
			for(int c=5;c>=r;c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
