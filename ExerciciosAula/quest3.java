import java.util.Scanner;
public class quest3{
    public static void main(){
        Scanner in = new Scanner (System.in);
       
       System.out.println("Digite uma frase e será dito quantos espaços em branco há nela: ");
       String str = in.nextLine();
       int espaços = 0;
       
       for(int i = 0; i < str.length(); i++){
           char ch = str.charAt(i);
           if(ch == ' '){
               espaços++;
           }
       }
       System.out.printf("A frase \"%s\" possui %d espaços em branco.", str, espaços);
    }
}
