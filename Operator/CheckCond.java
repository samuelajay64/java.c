/*WAJPT WEWTHER THE GIVEN NUMBER IS DIVISIBLE BY 4 OR NOT IF IS DIVISIBLE BY 4 
CHECK WEATHER THE NUMBER IS DIVISIBLE BY 6 AND CHECK WEATHER THE LAST DIGIT OF 
THE NUMBER IS GRATER THA 7 OR NOT IF IT IS GRATER THAN 7 PRINT I LOVE YOU 
OTHER WISE PRINT WITH SUTIABLE MESSAGES */
class CheckCond
{
public static void main(String[] args)
{
int n=42;
if(n%4==0)
{
if(n%6==0)
{
int last=n%10;
if(last>7)
{
System.out.println("i love you");
}
else
{System.out.println("last is not grater thaan 7");
}
}
else
{
	System.out.println(n+" is not divisible by 6");
}
}
else
{
	System.out.println(n+" is not divisible by 4");
}
}
}
	