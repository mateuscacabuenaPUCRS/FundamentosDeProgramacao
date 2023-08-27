import java.util.Scanner;
public class questao1
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
      System.out.print("Digite uma string que será dito a quantia de caracteres e se possui alguma vogal: ");
      String word = in.nextLine();
      
      System.out.printf("A quantia de caracteres que a palavra \"%s\" possui é: ");
      System.out.print(word.length());
      
      if (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u"))
      {
          System.out.print("Sim, esta palavra possui uma vogal"); 
      }
      else if (word.contains("A") || word.contains("E") || word.contains("I") || word.contains("O") || word.contains("U"))
      {
          System.out.print("Sim, esta palavra possui uma vogal");
      }
      else 
          System.out.print("Não, esta palavra não possui uma vogal");
    }
}