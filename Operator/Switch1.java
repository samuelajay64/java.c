/*WAJPT check weather yhe given character is vowel or not using switch:*/
class Switch1
{
	public static void main(String[] args)
	{
		char c='a';
		switch(c)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			System.out.println(c+" is a voewl");
			break;
			default :{
				System.out.println(c+" is a consonant");
			}
		}
	}
}