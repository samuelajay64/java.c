/*WAJPT PRINT NUMBERS FROM N TO 1*/
import java.util.Scanner;
class NToOne
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt(),start=1;
		while(n>=start)
		{
			System.out.println(n);
			n--;
		}
	}
}
		
