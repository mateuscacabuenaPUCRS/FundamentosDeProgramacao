import java.util.Scanner;
public class quest4{
    public static void main(){
        Scanner in = new Scanner (System.in);
        double valor;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        double soma = 0;
        double n=0;
        System.out.println("Digite um valor double (ou uma letra para sair)");
        while(in.hasNextDouble()){
            valor = in.nextDouble();
            if(valor>maior){
                maior = valor;
            }
            if(valor<menor){
                menor = valor;
            }
            soma = soma + valor;
            n++;
        }
        System.out.printf("Soma final = %.2f", soma);
        System.out.printf("%nMédia final = %.2f", soma / n);
        System.out.printf("%nO maior valor é %.2f", maior);
        System.out.printf("%nO menor valor é %.2f", menor);
        System.out.printf("%nA diferença entre o maior e o menor é %.2f", maior-menor);
    }
}
