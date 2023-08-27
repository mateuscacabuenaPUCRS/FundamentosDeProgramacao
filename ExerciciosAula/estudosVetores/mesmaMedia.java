import java.util.Scanner;
public class mesmaMedia
{
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
        
        if(mesmaMedia(v1, v2) == true){
            System.out.println("Sim, eles possuem a mesma média");
        }
        else{
            System.out.println("Não, eles não possuem a mesma média");
        }
    }
    public static boolean mesmaMedia (int[] vetor1, int[] vetor2){
        int soma = 0;
        for (int i = 0; i<vetor1.length; i++){
            soma = soma + vetor1[i];
        }
        double mediaVetor1 = soma / vetor1.length;
        System.out.println("Média do primeiro vetor é " + mediaVetor1);
        
        int soma2 = 0;
        for (int i = 0; i<vetor2.length; i++){
            soma2 = soma2 + vetor2[i];
        }
        double mediaVetor2 = soma2 / vetor2.length;
        System.out.println("Média do segundo vetor é " + mediaVetor2);
        
        boolean mesmaMedia = false;
        double E = 0.00000000000001;
        if(mediaVetor1 == mediaVetor2){
            mesmaMedia = true;
        }
        else if(mediaVetor1 > mediaVetor2){
            if(mediaVetor1 - mediaVetor2 <= E){
                mesmaMedia = true;
            }
        }
        else if(mediaVetor2 > mediaVetor1){
            if(mediaVetor2 - mediaVetor1 <= E){
                mesmaMedia = true;
            }
        }
        return mesmaMedia;
    }
}
