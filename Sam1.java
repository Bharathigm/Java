class Sam1
{
static int square()
{
int a=10;
return a*a;
}
static double circle()
{
int r=10;
double pi=3.14;
double res=pi*r*r;
return res+square();
}
public static void main(String[] args)
{
System.out.println("ms");
System.out.println(circle());
System.out.println("ms");
}
}


