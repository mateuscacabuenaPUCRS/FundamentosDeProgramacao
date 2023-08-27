import java.util.Scanner;
public class AdicionaisIfs
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
       
        System.out.printf("Digite respectivamente o seu nome e da outra pessoa que você deseja comparar a idade: ");
        String nome1 = in.nextLine();
        String nome2 = in.nextLine();
   
        System.out.printf("%nDigite respectivamente o dia que você e outra pessoa nasceram: ");
        int dia1 = in.nextInt();
        int dia2 = in.nextInt();
       
        System.out.printf("%nDigite respectivamente o mês que você e outra pessoa nasceram: ");
        int mes1 = in.nextInt();
        int mes2 = in.nextInt();
       
        System.out.printf("%nDigite respectivamente o ano que você e outra pessoa nasceram: ");
        int ano1 = in.nextInt();
        int ano2 = in.nextInt();
       
        if ((2050 > ano2 && 1900 < ano2 && ano1 > 1900 && ano1 < 2050) && (13 > mes2 && mes2 > 0 && mes1 < 13 && mes1 > 0) && (32 > dia2 && dia2 > 0 && dia1 > 0 && dia1 < 32))
        {
         if ((mes2 == 2 || mes2 == 4 || mes2 == 6 || mes2 == 9 || mes2 == 11) && (dia1 > 30 || dia2 > 30))
            {
                System.out.printf("%nErro: Data de nascimento inválida. (Fevereiro, Abril, Junho, Setembro e Novembro não possuem mais de 30 dias)");
            }
         //else if (mes1 == 2 && ((ano1 / 4 == 0 && ano1 / 100 == 0) || ano1 / 400 ==0)
         else
            {
             if (ano1 < ano2 || ano1 == ano2 && mes1 < mes2 || ano1 == ano2 && mes1 == mes2 && dia1 < dia2)
             {
                System.out.printf("%nO(a) %s é mais velho(a) que o(a) %s", nome1, nome2);
             }
                else if (ano1 > ano2 || ano1 == ano2 && mes1 > mes2 || ano1 == ano2 && mes1 == mes2 && dia1 > dia2)
             {
                System.out.printf("%nO(a) %s é mais velho(a) que o(a) %s", nome2, nome1);
             }
                else
             {
                System.out.printf("%nAs 2 pessoas possuem a mesma idade");
             } 
            }
        }
        else
        {
            System.out.printf("%nErro: Data de nascimento inválida. (Digite um ano menor que 2050 e maior que 1900, um mês de 1 a 12 e um dia de 1 a 31)");
        }

    }
}


