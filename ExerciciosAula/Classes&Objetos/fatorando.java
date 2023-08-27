import java.util.Scanner;
public class fatorando{
    public static void main(){
        Scanner in = new Scanner (System.in);
        int N = in.nextInt();
        System.out.println(fatorial(N));
    }
    public static int fatorial(int n)
    {            
        if(n==1)
        {
            System.out.printf("\nfatorial(1) = ");
            return 1;
        }
        else 
        {
             System.out.printf("\nfatorial(%d) = %d * fatorial(%d)", n, n, n-1);
             return n * fatorial(n-1);   
        }
    }
}
