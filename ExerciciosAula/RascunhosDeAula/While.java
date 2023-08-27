import java.util.Scanner;
public class While
{
   public static void main()
   {
     int num;
     int soma;
     int quantidade;
     double media;
     num = -1;
     soma = 0;
     quantidade = 0;
     Scanner in = new Scanner(System.in);
     
         
     while(num!=0)
     {
        System.out.println("Digite um valor inteiro (coloque 0 para encerrar): ");
        num = in.nextInt();
        if(num!=0)
        {
          soma = soma + num;
          quantidade = quantidade + 1;  
        }
     }
     System.out.printf("\nSoma dos numeros lidos foi %d \n", soma);
     System.out.printf("\nQuantidade de lidos: %d \n", quantidade);
     
     media = (double)soma / (double)quantidade;
     System.out.printf("\nMedia: %f \n", media);
     System.out.println("Programa encerrado!!!");
   }
}
