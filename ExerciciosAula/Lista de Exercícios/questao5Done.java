import java.util.Scanner;
public class questao5Done
{
    public static void main()
    {
       Scanner in = new Scanner (System.in);
        
      System.out.printf("Digite 3 números inteiros que responderemos para você quantos deles são ímpares: %n");
      int N1 = in.nextInt();
      int N2 = in.nextInt();
      int N3 = in.nextInt();
      
      System.out.printf("A quantia de números ímpares, dentre esses 3, é: ");
      
      if ((N1%2 !=  0 && N2%2 != 0 && N3%2 != 0))
      {
        System.out.printf("3");
      }
      else if ((N1%2 != 0 && N2%2 != 0 && N3%2 == 0) || (N1%2 != 0 && N2%2 == 0 && N3%2 != 0) || (N1%2 == 0 && N2%2 != 0 && N3%2 != 0))
      {
        System.out.printf("2"); 
      }
      else if ((N1%2 != 0 && N2%2 == 0 && N3%2 == 0) || (N1%2 == 0 && N2%2 != 0 && N3%2 == 0) || (N1%2 == 0 && N2%2 == 0 && N3%2 != 0))
      {
        System.out.printf("1"); 
      }
    }
}
