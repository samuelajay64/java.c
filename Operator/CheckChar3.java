/*WAJPT check weather the given character is lower case,upper case and number*/
class CheckChar3
{
	public static void main(String[] args)
	{
		char n='4';
		if(n>=65&&n<=90)
			System.out.println(n+" is in upper case");
		else if(n>=97&&n<=122)
			System.out.println(n+" is in lower case");
		else if(n>=48&&n<=57)
			System.out.println(n+" is a number");
	}
}