import java.util.Scanner;
public class questao5
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        System.out.printf("Digite uma palavra: ");
        String s1 = in.nextLine();
        
        String s2 = s1.replace('a','X');
        String s3 = s2.replace('A','X');
        String s4 = s3.replace('e','Y');
        String s5 = s4.replace('E','Y');
        String s6 = s5.replace('i','Z');
        String s7 = s6.replace('I','Z');
        String s8 = s7.replace('o','K');
        String s9 = s8.replace('O','K');
        String s10 = s9.replace('u','W');
        String s11 = s10.replace('U','W');
        
        System.out.printf("%n%s", s11);
        
    }
}
