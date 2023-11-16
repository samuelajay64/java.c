/*WAJAPT check weather the given character is alphabet */
class CheckChar
{
	public static void main(String[] args)
	{
	char c='x';
	if(c>='A'&&c<='Z'||c>='a'&&c<='z')
		System.out.println(c+ "is alphabet");
	else
		System.out.println(c+ "is not alphabet");
	}

}