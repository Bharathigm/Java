class E
{ 
static int square()
{
int a=10;
int c=a*a;
return c;
}
static double circle()
{
int r=10;
double pi=3.14;
double res=pi*r*r;
return res;
}
public static void main(String[] args)
{
System.out.println("ms");
int a=square();
double b=circle();
double c=a+b;
System.out.println(c);
System.out.println("me");
}
}

