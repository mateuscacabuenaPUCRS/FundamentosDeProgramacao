import java.util.Scanner;
public class questao4Done
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Digite a quantia inteira (não podendo conter centavos) que você deseja sacar: ");
        
        int MoneyDraw = in.nextInt();
        int MoneyHundred = MoneyDraw / 100;
        int MoneyFifty = (MoneyDraw % 100) / 50;
        int MoneyTen = ((MoneyDraw % 100) % 50) / 10;
        int MoneyOne = (((MoneyDraw % 100) % 50) % 10) / 1;
        
        System.out.println("Será recebido R$"+ MoneyDraw + " nesta quantia de notas: ");
        System.out.printf("Notas de R$100: %d", MoneyHundred);
        System.out.printf("%nNotas de R$50: %d", MoneyFifty);
        System.out.printf("%nNotas de R$10: %d", MoneyTen);
        System.out.printf("%nNotas de R$1: %d", MoneyOne);
    }
}
