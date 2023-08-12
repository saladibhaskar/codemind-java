import java.util.Scanner;
public class area{
    public static void main(String[] args)
    {
        Scanner ar=new Scanner(System.in);
        double a,b,c;
        
         a=ar.nextDouble();
         b=ar.nextDouble();
         c=ar.nextDouble();
        double s=(a+b+c)/2;
        double are= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",are);
    }
}