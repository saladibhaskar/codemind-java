import java.util.Scanner;
public class Sb{
public static void main(String[] dk){
    Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    for(int k=1;k<=t;k++)
    {
        double x2,y1,y2,x1=s.nextDouble();
         x2=s.nextDouble();
         y1=s.nextDouble();
         y2=s.nextDouble();
        int d;
        double m1=y1/x1;
        double m2=y2/x2;
        if(m1==m2)
        {
            d=0;
        }else if(m1<m2)
        {
            d=-1;
        }else{
            d=1;
        }
        System.out.print(d+"
");
        
    }
    
}}