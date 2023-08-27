import java.util.Scanner;
public class questao7Done
{
    public static void main()
    {
         Scanner in = new Scanner (System.in);
        
        System.out.print("Bem-vindo ao parquinho, digite sua idade para saber o preço do seu ingresso: ");
        int YourAge = in.nextInt();
        
        System.out.printf("O preço a pagar é de R$");
        if (YourAge <= 7)
        {
            System.out.printf("5");
        }
        else if (8 <= YourAge && YourAge <= 18)
        {
            System.out.printf("10");
        }
        else if (YourAge > 18)
        {
            System.out.printf("12");
        }
        else if (YourAge >= 60)
        {
            System.out.printf("8"); 
        }
    }
}
