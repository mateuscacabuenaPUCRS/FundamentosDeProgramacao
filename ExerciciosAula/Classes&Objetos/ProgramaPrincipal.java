public class ProgramaPrincipal
{
    public static void main(String args[])
    {
        /*
        Esfera esferaAzul = new Esfera();
        esferaAzul.setRaio(40);
        
        Esfera esferaVermelha = new Esfera();
        esferaVermelha.setRaio(80);
        */
         
        Esfera esferaAzul = new Esfera(40);
        Esfera esferaVermelha = new Esfera(80);
        
        System.out.println(esferaVermelha.calcularArea());
        
        
    }
    
    
    
    
    
}
