import java.util.Scanner;

public class Ex3_String_versaoA
{
   public static void main(String[] args)
   {
      final int MINUTOS_POR_HORA = 60;

      Scanner in = new Scanner(System.in);
      System.out.print("Por favor, entre com o primeiro horário: ");
      int primeiroHorario = in.nextInt();
      int primeiroHorarioEmMinutos = primeiroHorario / 100 * MINUTOS_POR_HORA + primeiroHorario % 100;

      System.out.print("Por favor, entre com o segundo horário: ");
      int segundoHorario = in.nextInt();
      int segundoHorarioEmMinutos = segundoHorario / 100 * MINUTOS_POR_HORA + segundoHorario % 100;

      int minutos = segundoHorarioEmMinutos - primeiroHorarioEmMinutos;
      int horas = minutos / 60;
      minutos = minutos % 60;

      System.out.printf("%d hora%s %d minutos\n", horas, (horas == 1) ? "" : "s" ,minutos);
   }
}
