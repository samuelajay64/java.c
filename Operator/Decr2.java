class Decr2
{
	public static void main(String[] args)
	{
		int a=25;
		int b=++a - a++;
		int c=--b + ++a - b--;
		int d=--c + b++ + c--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}