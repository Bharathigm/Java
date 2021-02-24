public class Rev
{
    public static void main(String args[]) 
    {

        String s = "asdfg";
        char[] ch = s.toCharArray();
        int i=0;
        for(char c:ch)
        {
            i++;
        }
        System.out.print(i);
    }
}