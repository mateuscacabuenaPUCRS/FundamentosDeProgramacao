import java.util.Scanner;
public class questao2Done
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        
        System.out.println("Dado um gráfico com P1 = (x1,y1) e P2 = (x2,y2), digite o valor de cada um deles para ser calculada a distância e a inclinação da reta que une esses dois pontos.");
        System.out.println("ATENÇÃO: na matemática, não se pode dividir um número por 0, então se a subtração de x2 - x1 = 0, ocorrerá um erro ao calcular o valor de a.");
        System.out.printf("%nComeçando pelo P1, digite o valor x1 e y1, respectivamente: ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        
        System.out.println("P1 = (" + x1 + "," + " " + y1 + ")");
        
        
        System.out.println("Agora numere o x2 e y2 de P2, respectivamente: ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        System.out.println("P2 = (" + x2 + "," + " " + y2 + ")");
        
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));       
        double inclinacao = (y2 - y1) / (x2 - x1);
        
        System.out.printf("A distância entre eles é de %.2f", distance);
        System.out.printf("%nO valor de inclinação da reta que une esses dois pontos é %.2f", inclinacao);
            
            
    }
}