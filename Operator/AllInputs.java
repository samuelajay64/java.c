/*WAJPT take all user input and print it*/
import java.util.Scanner;
class AllInputs
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number for byte");
		byte a=s.nextByte();
		System.out.println("Enter a number for short");
		short b=s.nextShort();
		System.out.println("Enter a number for int");
		int c=s.nextInt();
		System.out.println("Enter a number for long");
		long d=s.nextLong();
		System.out.println("Enter a number for float");
		float e=s.nextFloat();
		System.out.println("Enter a number for double");
		double f=s.nextDouble();
		System.out.println("Enter a character");
		char g=s.next().charAt(0);
		System.out.println("Enter a boolean");
		boolean h=s.nextBoolean();
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(name);
	}
}
		
		