/*WAJPT PRINT NUMBERS FROM M TO N*/
import java.util.Scanner;
class MToN
{
	public static void main(String[] E)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter m value");
		int m=s.nextInt(),n=1;
		while(m>=n)
		{
			System.out.println(m);
			m--;
		}
	}
}