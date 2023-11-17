/*WAJPT PRINT EVEN NUMBERS FROM 1 TO N*/
import java.util.Scanner;
class EvenNum
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
		System.out.println("enter start value");
		int start=s.nextInt();
		while(start<=n)
		{
			if(start%2==0)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}