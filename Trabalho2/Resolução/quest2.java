import java.util.Scanner;
public class quest2{
    public static void main(){
         Scanner in = new Scanner (System.in);
        
        System.out.println("Digite dois valores para saber a média dos números entre eles: ");
        double a = in.nextInt();
        double b = in.nextInt();
        double soma = 0;
        double media = 0;
        double mediaFinal = 0;
        if (a>b){
            while(a>=b){
                soma = soma + b;
                media++;
                b++;
            }
            mediaFinal = soma / media;
            System.out.printf("A média é %.1f", mediaFinal);
        }
        else if (a<b){
            while(a<=b){
                soma = soma + a;
                media++;
                a++;
            }
            mediaFinal = soma / media;
            System.out.printf("A média é %.1f", mediaFinal);
        }
        else{
            mediaFinal = (a*2) / 2;
            System.out.printf("a média entre %.0f e %.0f é %.1f", a, b, mediaFinal);
        }
    }
}
