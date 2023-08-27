import java.util.Scanner;
public class contagemRegressiva
{
    public static void main()
    {
         Scanner in = new Scanner (System.in);
        System.out.printf("Digite um número: ");
        int number = in.nextInt();
        
        while(number > 0)
        {
            if (number == 1)
            {
                System.out.printf("Falta %d segundo.%n", number);
                break;
            }
            else
            {
                System.out.printf("Faltam %d segundos.%n", number);
                number--;
            }
        }
    }
}
