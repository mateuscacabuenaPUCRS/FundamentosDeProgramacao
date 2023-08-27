import java.util.Scanner;
public class maiorNumFloatPoint{
    public static void main(){
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite 3 valores e será retornado o maior deles: ");
        double v1 = in.nextDouble();
        double v2 = in.nextDouble();
        double v3 = in.nextDouble();
        double maiorNumero = retornarMaiorNumero(v1, v2, v3);
        System.out.println(maiorNumero);
    }
    
    public static double retornarMaiorNumero (double v1, double v2, double v3){
        if (v1>v2 && v1>v3){
            return v1;
        }
        else if (v2>v1 && v2>v3){
            return v2;
        }
        else if(v3>v2 && v3>v1){
            return v3;
        }
        else{
            System.out.println("iguais, portanto: ");
            return v1;
        }
    }
}