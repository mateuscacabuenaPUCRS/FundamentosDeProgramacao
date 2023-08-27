public class Operadores
{
    public static void main (String args[])
    {
        int idade = 46;
        boolean votoObrigatorio = false;
        
        votoObrigatorio = (idade>=18 && idade<60);
        System.out.println("Idade: " + idade);
        System.out.println("Voto obrigatoio? " + votoObrigatorio);
    }
}
