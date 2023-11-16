/*WAJPT take integer user input and print it*/
import java.util.Scanner;
class Integer
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		byte a=s.nextByte();
		short b=s.nextShort();
		int c=s.nextInt();
		long d=s.nextLong();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}