import java.util.Scanner;
public class maiorNum{
    public static void main(){
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite 2 valores e será retornado o maior deles: ");
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        int maiorNumero = retornarMaiorNumero(v1,v2);
        System.out.println(maiorNumero);
    }
    
    public static int retornarMaiorNumero (int v1, int v2){
        if (v1>v2){
            return v1;
        }
        else if (v2>v1){
            return v2;
        }
        else{
            System.out.println("iguais, portanto: ");
            return v1;
        }
    }
}