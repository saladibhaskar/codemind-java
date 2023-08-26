import java.util.*;
public class Sb{
    public static void main(String[] as)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;;i++)
        {
            if(i%a==0 &&i%b==0)
            {
                System.out.print(i);
                break;
            }
        }
    }
}