import java.util.Scanner;
public class quest1{
    public static void main(){
         Scanner in = new Scanner (System.in);
        
        System.out.println("Digite dois valores para saber a soma dos números entre eles: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int soma = 0;
        
        if (a>b){
        while (a>b){
            soma = soma + b + (b+1);
            b = b + 2;
            if (a<=b){
                System.out.println("Resultado final: " + soma);
            }
        }
    }
        else if(a<b){
        while(a<b){
            soma = soma + a + (a+1);
            a = a + 2;
            if (a>=b){
                System.out.println("Resultado final: " + soma);
            }
        }
    }
        else{
            int iguais = a * 2;
            System.out.printf("%d + %d = %d", a, b, iguais); 
        }
  }
}
