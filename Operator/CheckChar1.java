/*WAJPT check weather the given chearacter is upper case and lower case*/
class CheckChar1
{
	public static void main(String[] args)
	{
		char a='d';
		if(a<='A'&&a<'Z')
			System.out.println(a+ " is upper case");
		else if(a>='a'&&a<'z')
			System.out.println(a+ " is lower case");
	}
}