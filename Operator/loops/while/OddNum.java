/*WAJPT print odd number from m to n*/
import java.util.Scanner;
class OddNum
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter m value");
		int m=s.nextInt();
		System.out.println("enter n value");
		int n=s.nextInt();
		while(m<=n)
		{
			if(m%2==1)
			{
				System.out.println(m);
			}
			m++;
		}
	}
}