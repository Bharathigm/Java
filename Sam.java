class Sam
{
static int square()
{
int a=10;
int b=a*a;
return b;
}
static double circle()
{
int a=square();
int r=10;
double pi=3.14;
double res=pi*r*r;
double result=res+a;
return result;
}
public static void main(String[] args)
{
System.out.println("ms");
double res=circle();
System.out.println(res);
System.out.println("ms");
}
}


