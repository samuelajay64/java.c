/* WAJPT CHECK WEATHER THE LARGEST NUMBER AMOUNG 3 NUMBERS*/
class Jay1
{
	public static void main(String[] args)
	{
		int a=20,b=30,c=60;
		if(a>b&&a>c)
		{
			System.out.println(a+ " is largest");
		}
		else if(b>a&&b>c)
		{
			System.out.println(b+ " is largest");
		}
		else
		{
			System.out.println(c+ " is largest");
		}
	}
}