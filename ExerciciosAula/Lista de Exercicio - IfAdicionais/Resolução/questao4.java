import java.util.Scanner;
public class questao4
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        System.out.printf("Digite uma palavra: ");
        String s1 = in.nextLine();
        
        String s2 = s1.replace('a','x');
        String s3 = s2.replace('e','x');
        String s4 = s3.replace('i','x');
        String s5 = s4.replace('o','x');
        String s6 = s5.replace('u','x');
        
        System.out.printf(s6);
        
    }
}
