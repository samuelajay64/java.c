class DivBoth
{
public static void main(String[] args)
{
int n=1000;
String res=n%2==0 && n%10==0?"is divisible":"is not divisible";
System.out.println(n+res+ " by the given number ");
}
}