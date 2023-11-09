class DivBoth3
{
public static void main(String[] args)
{
int n=29;
int a=29%10;
String res=a%4==0 && a%8==0?" last digit is divisible by both":" last digit is not divisible by both";
System.out.println(n+res+ " the given");
}
}