class Ex8
{
	public static void main(String[] args)
	{
		int a=34,b=55,c=88;
		int res=a>b&&a>c?a:(b>c?b:c);
		System.out.println("the greatest among "+a+" , "+b+" , "+c+" is "+res);
	}
}