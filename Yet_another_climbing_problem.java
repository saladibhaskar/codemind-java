import java.util.Scanner;
public class He
{
    public static void main(String[] sb)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=1;i<=t;i++)
        {
        int a=s.nextInt();
        int b=s.nextInt();
        if(a%b==0)
        {
            int skk=a/b;
            System.out.println(skk);
        }
        else{
            int sk=(a/b)+a%b;
            System.out.println(sk);
        }
        }
        }
    }