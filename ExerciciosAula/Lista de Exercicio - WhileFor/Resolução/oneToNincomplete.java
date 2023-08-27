import java.util.Scanner;
public class oneToNincomplete
{
   public static void main()
   {
       Scanner in = new Scanner (System.in);
       System.out.printf("Digite o valor de n: ");
       int n = in.nextInt();
       
       int i = 0;
       while (i<n)
       {
           int x = i + 1;
           System.out.println(i+x);
           i++;
       }
   }
}
