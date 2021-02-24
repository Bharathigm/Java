class F
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
double theta=30.1;
double c=0.5*r*r*theta;
return c;
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


