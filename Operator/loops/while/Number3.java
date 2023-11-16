import java.util.Scanner;
class Number3
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter start value");
		int start=s.nextInt();
		System.out.println("enter end value");
		int end=s.nextInt();
		while(start>=end)
		{
			System.out.println("ajay");
			start--;
		}
	}
}