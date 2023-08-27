import java.util.Scanner;
public class fiscalPrimo{
    public static void main(){
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite um valor e será dito se ele é primo ou não: ");
        int valor = in.nextInt();
        
        ehPrimo(valor);
        
        
    }
    
    public static boolean ehPrimo(int valor)
    {
        //para ser primo so pode ser divisivel por ele mesmo e por 1
        //exemplo 7
        boolean divisivelPorOutroNumero = false;
        System.out.println("Verificar se " + valor + " eh primo: ");
        for(int i=2;i<valor;i++)
        {
            System.out.println("testando se " + valor + " é dividido por " + i);
            if(valor % i == 0)
            {
                divisivelPorOutroNumero = true;
                System.out.println(valor + " % " + i + " = 0");
            }
            else{
                System.out.println("Checado, não é divisível.");
            }
        }
        
        boolean retornoEhPrimo = !divisivelPorOutroNumero;
        if(retornoEhPrimo = true){
            System.out.println("É primo");
        }
        else if(retornoEhPrimo = false){
            System.out.println("Não é primo");
        }
        return retornoEhPrimo;
    }
}
