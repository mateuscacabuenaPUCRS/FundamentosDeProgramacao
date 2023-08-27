import java.util.Scanner;
public class ProgramaPrincipa
{
    public static void main(String args[])
    { 
        CaixaRegistradora cr1 = new CaixaRegistradora();
        int opcao=-1;
        Scanner t = new Scanner(System.in);
        while(opcao!=0)
        {
            System.out.println("SUPERMERCADOS TE VEJO AMANHA!");
            System.out.println("-----------------------------");
            System.out.println();
            System.out.println("Programa Caixa Registradora");
            System.out.println();
            System.out.println("1 - Adicionar itens");
            System.out.println("2 - Exibir total do caixa");
            System.out.println("3 - Exibir quantidade de itens");
            System.out.println("4 - Zerar");
            System.out.println("0 - Sair");
            System.out.println();        
            System.out.println("Selecione a opção: ");
            opcao = t.nextInt();
            switch(opcao)
            {
                case 1:{
                    double valor = -1;
                    while(valor!=0)
                    {
                        System.out.println("Digite o valor: (0 para terminar).");
                        valor = t.nextDouble();
                        cr1.adicionarItem(valor);
                    }
                    break;
                }
                case 2:
                    {
                       System.out.println("Total do Caixa"); 
                       System.out.println(cr1.getValorTotal()); 
                       t.nextLine();
                       t.nextLine();
                       break;
                    }
                    
            }
        }
   }
}