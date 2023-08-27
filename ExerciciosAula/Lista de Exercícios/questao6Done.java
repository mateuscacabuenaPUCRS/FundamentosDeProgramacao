import java.util.Scanner;
public class questao6Done
{
    public static void main()
    {
         Scanner in = new Scanner (System.in);
         
        System.out.printf("Digite dois números aleatórios que será mostrado qual é o menor: %n");
        int N1 = in.nextInt();
        int N2 = in.nextInt();
        
        System.out.printf("%nO menor número dentre os 2 digitados é: ");
        if (N1 < N2)
        {
           System.out.printf("%d", N1);  
        }
        else if (N1 > N2)
        {
           System.out.printf("%d",N2);
        }
        else
        {
            System.out.printf(" %nOs números são iguais, portanto, não há maior, nem menor.");
        }
    }
}
