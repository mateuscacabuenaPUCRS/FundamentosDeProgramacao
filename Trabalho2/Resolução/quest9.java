import java.util.Scanner;
public class quest9{
    public static void main(){
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite o valor da altura: ");
        int height = in.nextInt();
        
        System.out.println("Digite o valor da largura: ");
        int width = in.nextInt();
        for (int i = 1; i <= height; i++)
        {
            for (int j = 1; j <= width; j++) 
            { 
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}

