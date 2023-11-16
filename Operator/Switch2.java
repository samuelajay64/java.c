/*WAJPT check weather the given number is even or not by using SWITCH*/
class Switch2
{
	public static void main(String[] args)
	{
		int n=40;
		switch(n%2)
		{
			case 0:
			System.out.println(n+" even");
			break; case 1:
			System.out.println(n+" odd");
		}
	}
}