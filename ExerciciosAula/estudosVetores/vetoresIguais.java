import java.util.Scanner;
public class vetoresIguais{
    public static void main(){
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite o tamanho do seu primeiro vetor: ");
        int[] v1 = new int[in.nextInt()];
        System.out.println("Agora, digite os elementos deste vetor: ");
        for(int i = 0; i<v1.length; i++){
            v1[i] = in.nextInt();
        }
        
        System.out.printf("%nDigite o tamanho do seu segundo vetor: ");
        int[] v2 = new int[in.nextInt()];
        System.out.println("Agora, digite os elementos deste vetor: ");
        for(int i = 0; i<v2.length; i++){
            v2[i] = in.nextInt();
        }
        
        if(mesmoTamanho(v1, v2) && mesmoElemento(v1, v2) == true){
            System.out.println("São iguais");
        }
        else{
            System.out.println("Não são iguais");
        }
    }
    
    public static boolean mesmoTamanho(int[] vetor1, int[] vetor2){
        boolean mesmoTam = false;
        
        if(vetor1.length == vetor2.length){
            mesmoTam = true;
        }
        return mesmoTam;
    }
    
    public static boolean mesmoElemento(int[] vector1, int[] vector2){
        boolean mesmoElem = true;
        for (int i = 0; i<vector1.length; i++){
            if(vector1[i] != vector2[i]){
                mesmoElem = false;
            }
        }
        return mesmoElem;
    }
}