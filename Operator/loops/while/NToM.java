/*WAJPT PRINT NUMBERS FROM N TO M*/
import java.util.Scanner;
class NToM
{
	public static void main(String[] A)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt(),m=1;
		while(m<=n)
		{
			System.out.println(m);
			m++;
		}
	}
}