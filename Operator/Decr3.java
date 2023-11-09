class Decr3
{
	public static void main(String[] args)
	{
		int a=23;
		int b=++a + --a;
		int c=a++ - a-- + b++ - --b;
		int d=c++ - --c + a++ - b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}