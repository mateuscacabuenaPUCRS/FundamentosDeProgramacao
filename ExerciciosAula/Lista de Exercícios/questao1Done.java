import java.util.Scanner;
public class questao1Done
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
    
      System.out.printf("Digite o valor do lado maior e o valor do lado menor do terreno: %n");
      int LadoTerreno1 = in.nextInt();
      int LadoTerreno2 = in.nextInt();
      int AreaTerreno = LadoTerreno1 * LadoTerreno2;
      
      System.out.printf("O terreno possui uma área de %d metros quadrados", AreaTerreno);
      
      System.out.printf("%n%nAgora, digite o valor do lado maior e o valor do lado menor do retângulo da casa: %n");
      int LadoCasa1 = in.nextInt();
      int LadoCasa2 = in.nextInt();
      int AreaCasa = LadoCasa1 * LadoCasa2;
      int AreaLivre = AreaTerreno - AreaCasa;
      int AreaLivrePorcento = AreaLivre * 100 / AreaTerreno;
      
      System.out.printf("A área da casa é de %d metros quadrados", AreaCasa);
      System.out.printf("%nPortanto, a área livre é de %d metros quadrados, equivalente a %d%% do terreno total", AreaLivre, AreaLivrePorcento);
    }
}