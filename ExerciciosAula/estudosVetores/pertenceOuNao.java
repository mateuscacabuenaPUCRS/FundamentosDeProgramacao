//Para treinar: Otimize para o usuário digitar quantos números ele quiser e após cada digitação retornar se pertence ou não.
import java.util.Scanner;
public class pertenceOuNao
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Digite um valor e será dito se ele pertence ao vetor de números inteiros: ");
        int Z = in.nextInt();
        
        int[] v1 = new int[3];
        v1[0] = 18;
        v1[1] = 2;
        v1[2] = 3;
        
        if(pesquisaNumero(v1, Z) == true){
            System.out.println("Pertence");
        }
        else{
            System.out.println("Não pertence");
        }
    }
    
    public static boolean pesquisaNumero(int[] vetor, int numero){
        boolean achou = false;
        for(int i = 0; i<vetor.length; i++){
            if(numero==vetor[i]){
                achou = true;
            }
        }
        return achou;
    }
}
