import java.util.Scanner;
public class main{
    public static void main(){
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite uma palavra e será retornado a inversão dela");
        String word = in.nextLine();
        
        String palavraInvertida = retornaContrario(word);
    }
    public static String retornaContrario(String str){
        int quantidade = str.length() - 1;
        for (int i = 0; i<=quantidade; i++){
            char letraInicial = str.charAt(i);
            char letraFinal = str.charAt(quantidade);
            
            str = str.replace(letraInicial,letraFinal);
            str = str.replace(letraFinal,letraInicial);
            
            quantidade--;
            System.out.println(str);
        }
        return str;
    }
}