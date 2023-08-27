public class aula1
{
    public static void aula1 (String args[])
    {
        int idade = 10;
        boolean ehIdoso = false;
        boolean ehMenorDeIdade = false;
        
        ehIdoso = idade >= 60;
        ehMenorDeIdade = idade < 18;
        
        System.out.println(idade);
        System.out.println(ehIdoso);
        System.out.println(ehMenorDeIdade);
        
        System.out.println("Para uma pessoa com idade de " + idade + " anos");
        System.out.println("É idoso? " + ehIdoso);
        System.out.println("É menor de idade? " + ehMenorDeIdade);
        
        //deste modo é feito boa parte da programação em sites
        
    
    }
}