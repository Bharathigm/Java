class Sam4
{
static int hr()
{
int sal=10000;
int month=12;
int asal=sal*month;
return asal+manager();
}
static int manager()
{
int bonus=10000;
return bonus;
}
public static void main(String[] args)
{
System.out.println(hr());
}
}


