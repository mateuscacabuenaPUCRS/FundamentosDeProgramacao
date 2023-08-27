import java.util.Scanner;
import java.util.Random;
public class Jogo{
    public static void main(){
        Scanner in = new Scanner (System.in);
       
        final int LINHAS = 3;
        final int COLUNAS = 3;
       
        System.out.println("Bem-vindo ao jogo de programação, digite o nome dos 2 jogadores: ");
        String jogador1 = in.nextLine();
        String jogador2 = in.nextLine();
       
        System.out.println("Agora, será sorteado os números entre 1 e 30 que participarão da matriz 3x3");
        int[][] matriz = geraMatriz();
        
        int placar1 = 0;
        int placar2 = 0;
       
        do{
            if(acertouJogador1(matriz, jogador1) == true){
                placar1++;
                System.out.printf("Parabéns %s, você acertou, sua pontuação agora é %d", jogador1, placar1);
            }
            //quando o num for errado
            else{
                System.out.printf("Que pena %s, você errou, sua pontuação é %d", jogador1, placar1);
            }
            if(jogoAcabou(matriz) == true){
                break;
            }
            if(acertouJogador2(matriz, jogador2) == true){
                placar2++;
                System.out.printf("Parabéns %s, você acertou, sua pontuação agora é %d", jogador2, placar2);
            }
            //quando o num for errado
            else{
                System.out.printf("Que pena %s, você errou, sua pontuação é %d", jogador2, placar2);
            }
        }
        while(jogoAcabou(matriz) == false);
        
        if(jogoAcabou(matriz) == true){
            if(placar1>placar2){
                System.out.printf("%n%nO jogo acabou. O vencedor é: %s com %d pontos.", jogador1, placar1);
            }
            else if(placar1<placar2){
                System.out.printf("%n%nO jogo acabou. O vencedor é: %s com %d pontos.", jogador2, placar2);
            }
            else if(placar1==placar2){
                System.out.printf("%n%nO jogo acabou. Houve um empate, %s e %s fizeram %d pontos.", jogador1, jogador2, placar2);
            }
        }
    }
    
    public static int[][] geraMatriz(){
        int[][] matriz = new int [3][3];
        for(int lin = 0; lin<matriz.length; lin++){
            for(int col = 0; col<matriz[0].length; col++){
                int numero;
                do{
                    numero = sortearInteiro(1,30);
                } 
                while (numeroJaExiste(numero, matriz)); // se o número já existe na matriz, gera novamente
                matriz[lin][col] = numero; 
            }
        }
        return matriz;
    }
    
    public static int sortearInteiro(int minimo, int maximo)
    {
        Random g = new Random();
        int n = g.nextInt(maximo - minimo) + minimo;
        return n;
    }
    
    private static boolean numeroJaExiste(int numero, int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    return true;
                }
            }
        }
        return false;
    }
    
    //MÉTODOS PARA CHECAR SE O JOGADOR 1 E 2 ACERTARAM O NÚMERO
    public static boolean acertouJogador1(int[][]m, String j1){
        Scanner in = new Scanner (System.in);
        boolean acertou = false;
        System.out.printf("%n%n%s, digite um número que acha que contém na matriz: ", j1);
        int n = in.nextInt();
        for(int lin = 0; lin<m.length; lin++){
            for(int col = 0; col<m[0].length; col++){
                if(n == m[lin][col]){
                    acertou = true;
                    m[lin][col] = -1; //invalidar o número já digitado
                    break;
                }
            }
        }
        return acertou;
    }
    
    public static boolean acertouJogador2(int[][]m, String j2){
        Scanner in = new Scanner (System.in);
        boolean acertou = false;
        System.out.printf("%n%n%s, digite um número que acha que contém na matriz: ", j2);
        int n = in.nextInt();
        for(int lin = 0; lin<m.length; lin++){
            for(int col = 0; col<m[0].length; col++){
                if(n == m[lin][col]){
                    acertou = true;
                    m[lin][col] = -1; //invalidar o número já digitado
                    break;
                }
            }
        }
        return acertou;
    }
    
    public static boolean jogoAcabou (int[][] m){
        boolean jogoAcabou = false;
        for(int lin=0; lin<m.length; lin++)
        {            
            for(int col=0; col<m[0].length; col++)
            {
                if(m[lin][col] == -1){
                    jogoAcabou = true;
                }
                else if(m[lin][col] != -1){
                    jogoAcabou = false;
                }
            }            
        }
        return jogoAcabou;
    }
}