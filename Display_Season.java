import java.util.Scanner;
public class Solution{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        String s;
        if(n==7||n==8||n==9||n==10)
        {
            s="Rainy";
        }else if(n==11||n==12||n==1)
        {s="Winter";
            
        }else if(n==2||n==3)
        {
            s="Spring";
        }else if(n==4||n==5||n==6)
        {
            s="Summer";
        }
        else
        {
            s="-1";
        }
        System.out.print(s);
     }
}