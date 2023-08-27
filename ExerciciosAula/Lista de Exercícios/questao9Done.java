import java.util.Scanner;
public class questao9Done
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        System.out.printf("Digite qualquer palavra e será respondido se esta palavra possui a letra \"a\": ");
        String s1 = in.nextLine();

        if (s1.contains("a"))
        {
           System.out.println("Sim, " + s1 + " possui a letra \"a\"");
        }
        else
        {
          System.out.printf("Não, "+ s1 + " não possui a letra \"a\"");  
        }
    }
}
