/*Shubhangini
 Print the Pattern:
            0 
          1 0 1 
        2 1 0 1 2 
      3 2 1 0 1 2 3 
    4 3 2 1 0 1 2 3 4 
  5 4 3 2 1 0 1 2 3 4 5 

 */
public class Q9 {

	public static void main(String[] args) {
		int i=0;
		for(int r=i;r<=5;r++)
		{
			 
			for(int c=5;c>=r;c--)
			{
				System.out.print("  ");
				
			}
			for(int c=r;c>=1;c--)
			{
				System.out.print(c+" ");
				
			}
			
			for(int k=0;k<=r;k++)
							
				{
				   
					System.out.print(k+" ");
				}
			
			System.out.println();
				
			
			
			
		}

	}

}
