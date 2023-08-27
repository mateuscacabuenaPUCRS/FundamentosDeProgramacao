import java.util.Scanner;
public class questao3
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        System.out.printf("Digite quatro palavras: ");
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String s3 = in.nextLine();
        String s4 = in.nextLine();
        
        String s5 = s1.concat(s2);
        String s6 = s3.concat(s4);
        String s7 = s5.concat(s6);
        
        System.out.printf("%n O tamanho de todas juntas é de %d letras", s7.length());         
        System.out.printf("%n A junção de todos em letra maiúscula é %s", s7.toUpperCase());
        System.out.printf("%n A primeira vez que aparece a letra \'a\' é na posição %d", s7.indexOf("a"));
    }
}
