import java.util.Scanner;
public class potencializarWhile2{
    public static void main(){
         Scanner in = new Scanner (System.in);
        System.out.printf("Digite o valor do n: ");
        int n = in.nextInt();
        int x = 0;     
        while (x < n){
          double y = Math.pow(2,x);
          if (y >= n){
            break;
        }
        System.out.printf("%n%.0f", y);
          x++;
    }
}
}