import java.util.Scanner;
public class BS{
    public static void main(String [] sadf)
    {
        Scanner s=new Scanner (System.in);
        char n=s.next().charAt(0);
        String k;
        if(n=='a'||n=='A'||n=='e'||n=='E'||n=='i'||n=='I'||n=='o'||n=='O'||n=='u'||n=='U')
        {
          k="Vowel";  
        }else{
            k="Consonant";
        }
        System.out.print(k);
    }
}