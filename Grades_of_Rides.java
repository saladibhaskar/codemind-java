import java.util.Scanner;
public class Dn{
    public static void main(String [] sb)
    {
        Scanner s=new Scanner(System.in);
        int  a=s.nextInt(); 
        int b=s.nextInt();
        int c=s.nextInt();
        int k;
        if(a>50&&b>60&&c>100)
    {
        k=10;
    }
    else if(a>50&&b>60)
    {
        k=9;
    }
    else if(b>60&&c>100)
    {
        k=8;
    }
    else if(a>50&&c>100)
    {
        k=7;
    }else if(a>50||b>60||c>100)
    {
    k=6;
    }else{
        k=5;
    }
    System.out.print(k);
    }
}
