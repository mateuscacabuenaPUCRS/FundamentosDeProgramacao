import java.util.Scanner;
public class aula
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        
        System.out.println("Dado um gráfico com P1 = (x1,y1) e P2 = (x2,y2), digite o valor de cada um deles para ser calculada a distância.");
        System.out.println("Começando pelo P1, digite o valor x1 e y1, respectivamente: ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("P1 = (" + x1 + "," + " " + y1 + ")");
        
        
        System.out.println("Agora numere o x2 e y2 de P2, respectivamente: ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        System.out.println("P2 = (" + x2 + "," + " " + y2 + ")");
        
        
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));       
        
        System.out.printf("A distância entre eles é de %.2f", distance);
    }
}