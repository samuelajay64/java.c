/*WAJPT PRINT NUMBERS FROM 1 TO N*/
import java.util.Scanner;
class OneToN
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt(),start=1;
		while(start<=n)
		{
			System.out.println(start);
			start++;
		}
	}
}