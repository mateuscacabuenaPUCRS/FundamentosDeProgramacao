import java.util.Scanner;
public class questao2
{
    public static void main()
    {
        System.out.printf("Digite um nome: ");
         Scanner in = new Scanner (System.in);
        String name = in.nextLine();
        
        System.out.printf("%nMaiúsculo: %s", name.toUpperCase());
        System.out.printf("%nMinúsculo: %s", name.toLowerCase());
    }
}
