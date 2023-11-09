class DivOdd
{
public static void main(String[] args)
{
int n=135;
String res=n%2==0 || n%15==0 ? "is divisible by":"is not divisible";
System.out.println(n+res+ " the given number ");
}
}