class Incr2
{
	public static void main(String[] args)
	{
		int a=9;
		int b=a++;
		int c=a++ - b++;
		int d=c++ + ++b - a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}