/*Calcutor*/
import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter 1 for addition");
		System.out.println("enter 2 for substraction");
		System.out.println("enter 3 for multiplaction");
		System.out.println("enter 4 for division");
		int choice=s.nextInt();
		switch(choice)
		{
			case 1:
			{ 
				System.out.println("enter two numbers for addition");
				int a=s.nextInt();
				int b=s.nextInt();
				System.out.println(a+b);
			}
			break;
			case 2:
			{
                System.out.println("enter two numbers for substraction");
                int a=s.nextInt();
                int b=s.nextInt();
                System.out.println(a-b);
            }
            break;
            case 3:
			{
                System.out.println("enter two numbers for multiplaction");
                int a=s.nextInt();
                int b=s.nextInt();
                System.out.println(a*b);
            }
            break;
            case 4:
			{
                System.out.println("enter two numbers for division");
                int a=s.nextInt();
                int b=s.nextInt();
                System.out.println(a/b);
            }
            break;	
            default:
            System.out.println("invaild input");
		}
	}
}	