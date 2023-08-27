import java.util.Scanner;
public class quest12{
    public static void main(){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++) 
            { 
                System.out.printf("%d ", i); 
            }
            System.out.println();
        }
    }
}

