//Para treinar: Otimize para o usuário digitar quantos valores ele quiser em cada vetor, para depois checar se obtém o mesmo tamanho.
import java.util.Scanner;
public class mesmoTamanhoVetores{
    public static void main(){
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite o tamanho do seu primeiro vetor: ");
        int[] v1 = new int[in.nextInt()];
        
        System.out.println ("Digite o tamanho do seu segundo vetor: ");
        int[] v2 = new int[in.nextInt()];
        
        if(mesmoTamanho(v1, v2) == true){
            System.out.println("Possuem o mesmo tamanho");
        }
        else{
            System.out.println("Não possuem o mesmo tamanho");
        }
    }
    public static boolean mesmoTamanho(int[] vetor1, int[] vetor2){
        boolean iguais = false;
        
        if(vetor1.length == vetor2.length){
            iguais = true;
        }
        return iguais;
    }
}
