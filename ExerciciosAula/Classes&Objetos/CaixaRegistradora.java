public class CaixaRegistradora
{
    private int quantidadeItens=0;
    private double valorTotal=0;
    
    public void adicionarItem(double valor)
    {
        quantidadeItens = quantidadeItens + 1;
        valorTotal = valorTotal + valor;        
    }
    
    public int getQuantidadeItems()
    {
        return quantidadeItens;
    }
    
    public double getValorTotal()
    {
        return valorTotal;
    }
    
    public void zerar()
    {
        quantidadeItens=0;
        valorTotal=0.0;
    }
}

