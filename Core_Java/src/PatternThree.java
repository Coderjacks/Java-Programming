import java.util.Scanner;
public class PatternThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc= new Scanner(System.in);
				System.out.print("Enter a number to print a squire pattern: ");
				int NumberOfRows=sc.nextInt();
				for(int i=0; i<NumberOfRows;i++)
				{
					for(int j=i; j<NumberOfRows;j++)
					{
						System.out.print("*");
					
					}
					System.out.println();
				}
				
	}

}