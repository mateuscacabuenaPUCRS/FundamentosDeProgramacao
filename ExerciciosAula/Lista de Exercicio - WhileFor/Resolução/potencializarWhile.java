import java.util.Scanner;
public class potencializarWhile {
    public static void main() {
        Scanner in = new Scanner (System.in);
        final double N = 2;
        double SuperN = 0;
        int value = 0;
        
        System.out.println("Digite o valor de n: ");
        int n = in.nextInt();
        while (true) {
            SuperN = Math.pow(value, N);
            if(SuperN >= n) {
                break;
            }
            System.out.println(SuperN + " ");
            value++;
        }
    }
}
