import java.util.Scanner;
public class InvestmentTable
{
   public static void main()
   {  
      final double TAXA = 5;
      final double BALANCO_INICIAL = 10000;
      final double META = 2 * BALANCO_INICIAL;

      double balanco = BALANCO_INICIAL;
      int ano = 0;
      
      while(balanco < META)
      {
          ano++;
          double rendimento = balanco * TAXA / 100;
          balanco = balanco + rendimento;
      }
      System.out.println("O investimento duplicará após " + ano + " anos.");
   }
}