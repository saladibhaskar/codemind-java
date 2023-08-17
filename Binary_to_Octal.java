import java.util.Scanner;
public class He
{
    public static void main(String[] sb)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=1;i<=t;i++)
        {
            String n=s.next();
            int a=Integer.parseInt(n,2);
            String b=Integer.toString(a,8);
             System.out.println(b);
            }
        }
    }