import java.util.Scanner;
public class investimento{
    public static void main(){
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite seu saldo inicial: ");
        int saldoInicial = in.nextInt();
        
        System.out.println("Agora, digite seu percentual de rendimento anual: ");
        int rendimentoAnual = in.nextInt();
        
        System.out.println("Por último, quantos anos você manteve o investimento?");
        int anos = in.nextInt();
        
        double saldoFinal = máquinaDeInvestimento(saldoInicial, rendimentoAnual, anos);
        System.out.println(saldoFinal);
    }
    
    public static double máquinaDeInvestimento (double saldo_inicial, double rendimento_anual, int anosInvestimento){
        double saldo_final = saldo_inicial;
        for(int i = 1; i <= anosInvestimento; i++){
          saldo_final = saldo_final + saldo_final * (rendimento_anual / 100);
        }
        return saldo_final;
    }
}
