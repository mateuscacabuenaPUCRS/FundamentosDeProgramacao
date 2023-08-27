import java.util.Scanner;
public class questao3Done
{
   public static void main()
   {
      Scanner in = new Scanner (System.in);
       
      System.out.print("Insira abaixo as horas, os minutos e os segundos atuais do dia para serem convertidos no total de segundos.");
      
      System.out.printf("%nHoras: ");
      int hour = in.nextInt();
      
      System.out.print("Minutos: ");
      int minutes = in.nextInt();
      
      System.out.print("Segundos: ");
      int seconds = in.nextInt();
      
      int HoursInSec = hour * 3600;
      int MinutesInSec = minutes * 60;
      int SecondsInDay = HoursInSec + MinutesInSec + seconds;
      
      System.out.printf("Se o horário atual é %d:%d:%d, já se passaram %d segundos do dia", hour, minutes, seconds, SecondsInDay);
   }
}
