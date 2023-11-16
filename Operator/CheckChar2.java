/*WAJPT check weather the given charecter is number and alphabet*/
class CheckChar2
{
	public static void main(String[] args)
	{
		char a='9';
		if(a>=65&&a<=90||a>=97&&a<=122)
			System.out.println(a+" is alphabet");
		else if(a>=48&&a<=57)
			System.out.println(a+" is number");
	}
}