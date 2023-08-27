import java.util.Scanner;
public class SwitchEx
{
    public static void main()
    {
         Scanner in = new Scanner (System.in);
         
         System.out.print("Digite o preço do produto: ");
         int preço = in.nextInt();
          in.nextLine();
         
         System.out.print("Digite a sua categoria (A, B ou C): ");
         String cat = in.nextLine();
         
         double preçofinalA = preço - (preço * 0.1);
         double preçofinalB = preço - (preço * 0.2);
         double preçofinalC = preço - (preço * 0.3);
         
         switch(cat)
         {
             case "A":
                 System.out.printf("O preço do produto foi R$ %d, como pertence a categoria A, receberá 10%% de desconto. Preço Final: R$ %.2f", preço, preçofinalA);
            break;
            
             case "B":
                 System.out.printf("O preço do produto foi R$ %d, como pertence a categoria B, receberá 20%% de desconto. Preço Final: R$ %.2f", preço, preçofinalB);
            break;
            
             case "C":
                 System.out.printf("O preço do produto foi R$ %d, como pertence a categoria C, receberá 30%% de desconto. Preço Final: R$ %.2f", preço, preçofinalC);
            break;
            
            default:
                System.out.printf("ERRO - Categoria Inválida.");
         }
    }
}
