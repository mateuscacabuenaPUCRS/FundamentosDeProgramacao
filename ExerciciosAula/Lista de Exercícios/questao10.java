import java.util.Scanner;
public class questao10
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        System.out.printf("Digite duas palavras e será respondido se elas possuem o mesmo conteúdo: %n");
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        
        //Perguntar se continua sendo o mesmo conteúdo mesmo se for de letras maiúsculas ou minúsculas diferentes
        if (s1.equals(s2))
        {
            System.out.println("Sim, elas possuem o mesmo conteúdo");
        }
        else
        {
            System.out.println("Não, elas não possuem o mesmo conteúdo");
        }
    }
}
