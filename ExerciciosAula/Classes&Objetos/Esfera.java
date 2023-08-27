public class Esfera
{
    private double raio;
    
    //CONSTRUTOR DA CLASSE!!! EXECUTADO QUANDO UM OBJETO EH INSTANCIADO
    public Esfera(double raio)
    {
        this.raio = raio;
    }
    
    public double calcularVolume()
    {
        return (4/3*Math.PI*raio*raio*raio);
    }
    
    public double calcularArea()
    {
        return (4*Math.PI*Math.pow(raio,2));
    }
    
    public double getRaio()
    {
        return raio;
    }
    
    public void setRaio(double raio)
    {
        this.raio = raio;
    }
}
