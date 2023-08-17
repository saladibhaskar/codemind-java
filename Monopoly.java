import java.util.Scanner;
public class Sb
{
    public static void main(String[] sb)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=1;i<=t;i++)
        {
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            String d;
            if (a>(b+c))
            {
                d="YES";
            }
            else if (b>(c+a)){
                d="YES";
                
            }
            else if(c>(a+b))
            {
                d="YES";
            }else{
                d="NO";
            }
            System.out.println(d);
        }
    }
}