import java.util.Scanner;
public class Solution{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        String cl;
        if(n=='V'||n=='v')
        {
            cl="Violet";
        }else if(n=='i'||n=='I')
        {
            cl="Indigo";
        }else if(n=='B'||n=='b')
        {
            cl="Blue";
        }else if(n=='G'||n=='g')
        {
            cl="Green";
        }else if(n=='y'||n=='Y')
        {
            cl="Yellow";
        } else if(n=='O'||n=='o')
        {
            cl="Orange";
        }else if(n=='r'||n=='R')
        {
            cl="Red";
        }else{
            cl="-1";
        }
        System.out.print(cl);

}
}