/*
 ________________________________________
|________Enter the no of rows_______|:7
Congratulations Mr.Brijesh
Pattern 1

*******
*******
*******
*******
*******
*******
*******

Pattern 2

1234567
1234567
1234567
1234567
1234567
1234567
1234567

Pattern 3

7654321
7654321
7654321
7654321
7654321
7654321
7654321

Pattern 4

1111111
2222222
3333333
4444444
5555555
6666666
7777777

Pattern 5

7777777
7777777
7777777
7777777
7777777
7777777
7777777

Pattern 6

AAAAAAA
AAAAAAA
AAAAAAA
AAAAAAA
AAAAAAA
AAAAAAA
AAAAAAA

Pattern 7

AAAAAAA
BBBBBBB
CCCCCCC
DDDDDDD
EEEEEEE
FFFFFFF
GGGGGGG
Pattern 8

DDDDDDD
CCCCCCC
BBBBBBB
AAAAAAA
@@@@@@@
???????
>>>>>>>
Pattern 9

ABCDEFG
ABCDEFG
ABCDEFG
ABCDEFG
ABCDEFG
ABCDEFG
ABCDEFG
Pattern 10

DCBA@?>
DCBA@?>
DCBA@?>
DCBA@?>
DCBA@?>
DCBA@?>
DCBA@?>
Pattern 11

A
AB
ABC
ABCD
ABCDE
ABCDEF
ABCDEFG
Pattern 12

Z
ZY
ZYX
ZYXW
ZYXWV
ZYXWVU
ZYXWVUT
Pattern 13

A
AA
AAA
AAAA
AAAAA
AAAAAA
AAAAAAA
Pattern 14

A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
Pattern 15

Z
YY
XXX
WWWW
VVVVV
UUUUUU
TTTTTTT
Pattern 16

A
BC
CDE
DEFG
EFGHI
FGHIJK
GHIJKLM
Pattern 17

G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
*/

//Solution
import java.util.*;
public class PatternTrick {

	public static void main(String[] args) {
		/* How to approach 
		 *1.Outer loop
		 * Number of line = Number of Rows = Number of time
		 * 2. Identify how many column are there for each rows
		 * 3.What do you need to print
		 */
		System.out.println(" ________________________________________");
		System.out.print("|________Enter the no of rows_______|:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//input the no of rows
		//pattern functions
		System.out.println();
		System.out.println("Pattern 1\n");
		Pattern1(n);
		System.out.println("Pattern 2\n");
		Pattern2(n);
		System.out.println("Pattern 3\n");
		Pattern3(n);
		System.out.println("Pattern 4\n");
		Pattern4(n);
		System.out.println("Pattern 5\n");
		Pattern5(n);
		System.out.println("Pattern 6\n");
		Pattern6(n);
		System.out.println("Pattern 7\n");
		Pattern7(n);
		System.out.println("Pattern 8\n");
		Pattern8(n);
		System.out.println("Pattern 9\n");
		Pattern9(n);
		System.out.println("Pattern 10\n");
		Pattern10(n);
		System.out.println("Pattern 11\n");
		Pattern11(n);
		System.out.println("Pattern 12\n");
		Pattern12(n);
		System.out.println("Pattern 13\n");
		Pattern13(n);
		System.out.println("Pattern 14\n");
		Pattern14(n);
		System.out.println("Pattern 15\n");
		Pattern15(n);
		System.out.println("Pattern 16\n");
		Pattern16(n);
		System.out.println("Pattern 17\n");
		Pattern17(n);
       
	}
	
	
	//Declaretion of functions
	
	//pattern 1
	static void Pattern1(int n)
	{
		for(int row=1; row<=n;row++)
		{
			for(int col=1; col<=n;col++)
			{
				System.out.print("*");
			
			}
			System.out.println();
		}
		System.out.println();
	}
	// pattern 2 
	static void Pattern2(int n)
	{
		for(int row=1; row<=n;row++)
		{
			for(int col=1; col<=n;col++)
			{
				
				System.out.print(col);
			
			}
			System.out.println();
		}
		System.out.println();
	}
	//pattern 3
		static void Pattern3(int n)
		{
			for(int row=1; row<=n;row++)
			{
				for(int col=n; col>=1;col--)
				{
					System.out.print(col);
				
				}
				System.out.println();
			}
			System.out.println();
		}
		//pattern 4
				static void Pattern4(int n)
				{
					for(int row=1; row<=n;row++)
					{
						for(int col=1; col<=n;col++)
						{
							System.out.print(row);
						
						}
						System.out.println();
					}
					System.out.println("");
				}
		//pattern 5
		static void Pattern5(int n)
		{
			for(int row=1; row<=n;row++)
			{
				for(int col=1; col<=n;col++)
				{
					System.out.print(n);
				
				}
				System.out.println();
			}
			System.out.println();
		}
		
		//pattern 6
		static void Pattern6(int n)
		{
			for(int row=1; row<=n;row++)
			{
			
				for(int col=1;col<=n;col++)
				{
			
					System.out.print("A");
				    
				}
				
				System.out.println();
			}
			System.out.println();
		}
	// Pattern 7
		static void Pattern7(int n)
		{
			for(int row=1;row<=n;row++)
			{
				for(int col=1;col<=n;col++)
				{
					int CChar='A'+row-1;
					System.out.print((char)CChar);
				}
				System.out.println();
			}
		}

		// Pattern 8
				static void Pattern8(int n)
				{
					for(int row=1;row<=n;row++)
					{
						for(int col=1;col<=n;col++)
						{
							int CChar='D'-row+1;
							System.out.print((char)CChar);
						}
						System.out.println();
					}
				}
		// Pattern 9
				static void Pattern9(int n)
				{
					for(int row=1;row<=n;row++)
					{
						for(int col=1;col<=n;col++)
						{
							int CChar='A'+col-1;
							System.out.print((char)CChar);
						}
						System.out.println();
					}
				}
		// Pattern 10
				static void Pattern10(int n)
				{
					for(int row=1;row<=n;row++)
					{
						for(int col=1;col<=n;col++)
						{
							int CChar='D'-col+1;
							System.out.print((char)CChar);
						}
						System.out.println();
					}
				}
		// Pattern 11
				static void Pattern11(int n)
				{
					for(int row=1;row<=n;row++)
					{
						for(int col=1;col<=row;col++)
						{
							int CChar='A'+col-1;
							System.out.print((char)CChar);
						}
						System.out.println();
					}
				}
		// Pattern 12
				static void Pattern12(int n)
				{
					for(int row=1;row<=n;row++)
					{
						for(int col=1;col<=row;col++)
						{
							int CChar='Z'-col+1;
							System.out.print((char)CChar);
						}
						System.out.println();
					}
				}
				
				// Pattern 13
				static void Pattern13(int n)
				{
					for(int row=1;row<=n;row++)
					{
						for(int col=1;col<=row;col++)
						{
							int CChar='A';
							System.out.print((char)CChar);
						}
						System.out.println();
					}
				}
				// Pattern 14
				static void Pattern14(int n)
				{
					for(int row=1;row<=n;row++)
					{
						for(int col=1;col<=row;col++)
						{
							int CChar='A'+row-1;
							System.out.print((char)CChar);
						}
						System.out.println();
					}
				}
			// Pattern 15
				static void Pattern15(int n)
				{
					for(int row=1;row<=n;row++)
					{
						for(int col=1;col<=row;col++)
						{
							int CChar='Z'-row+1;
							System.out.print((char)CChar);
						}
						System.out.println();
					}
				}
				// Pattern 16
				static void Pattern16(int n)
				{
					for(int row=1;row<=n;row++)
					{
						int p=row+64;
						for(int col=1;col<=row;col++)
						{
							
							System.out.print((char)p);
							p++;
						}
						System.out.println();
					}
				}
				// Pattern 17
				static void Pattern17(int n)
				{
					for(int row=1;row<=n;row++)
					{
						
						for(int col=1;col<=row;col++)
						{
							int p=n+'A'+col-row-1;
							System.out.print((char)p);
						
						}
						System.out.println();
					}
				}



}
