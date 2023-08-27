import java.util.Scanner;
import java.lang.String;
public class questao8
{
  public static void main()
  {
      Scanner in = new Scanner (System.in);
     
     System.out.print("Digite duas palavras para ser mostrado qual delas é a menor, em questão de caracteres: ");
     String s1 = in.nextLine();
     String s2 = in.nextLine();
     
     //Problema: palavras diferentes com a mesma quantia de caracteres não estão sendo tratadas como iguais
     if (s1.compareToIgnoreCase(s2) > 0)
     {
        System.out.printf("A palavra \"%s\" é maior.", s1); 
     }
     else if (s1.compareToIgnoreCase(s2) < 0)
     {
        System.out.printf("A palavra \"%s\" é maior.", s2);
     }
     else if (s1.equalsIgnoreCase(s2))
     {
        System.out.printf("As palavras \"%s\" e \"%s\" tem a mesma quantia de caracteres.", s1, s2);
     }
  }
}
