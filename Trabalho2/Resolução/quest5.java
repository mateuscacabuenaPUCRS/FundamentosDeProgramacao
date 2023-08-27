import java.util.Scanner;
public class quest5{
    public static void main(){
        Scanner in = new Scanner (System.in);
        System.out.println("Digite uma palavra e será mostrado quantas vogais há nessa palavra: ");
        String str = in.nextLine();
        
        int vogais = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vogais++;
            }
        }
        System.out.printf("A palavra \"%s\" possui %d vogais.", str, vogais);
    }
}
