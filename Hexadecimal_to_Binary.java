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
            int a=Integer.parseInt(n,16);
            String b=Integer.toString(a,2);
            int len=b.length();
            if(len%4==0)
            {
            System.out.println(b);
                
            }
            else if (len%4==1)
            {
                System.out.println("000"+b);
                
            }
            else if (len%4==2)
            {
                System.out.println("00"+b);
                
            }else if (len%4==3)
            {
                System.out.println("0"+b);
                
            }
            }
        }
    }