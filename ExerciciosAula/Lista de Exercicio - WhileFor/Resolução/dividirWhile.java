import java.util.Scanner;
public class dividirWhile
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        System.out.printf("Digite o valor de n: ");
        int n = in.nextInt();
        int variavel = 1;
        while (variavel<n)
        {
            int variavel2 = variavel%10;
            if(variavel2==0)
            {
             System.out.println(variavel);
            }
            variavel++;
        }
    }
}