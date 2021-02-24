class Sam2
{
  static double sector()
   {
    int r=10;
    double theta=30.1;
    double b=0.5*r*r*theta;
    return b;
   }
  static double circle()
      {
	int r=2;
	double pi=3.14;
	double res=pi*r*r;
	double result=res+sector();
return result;
	}
   static double square()
    {
        int a=2;
	int b=a*a;
      return b+circle();
    }
   static double rect()
	{
	int l=2;
	int b=3;
	int r=l*b;
	return r+square();
	}
     public static void main(String[] args)
	{
	System.out.println("ms");
	double res=rect();
	System.out.println(res);
	System.out.println("ms");
 	}
  }


