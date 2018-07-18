public class Venda {

    private String data;
    private ItemVenda[] itens = new ItemVenda[10];
    private Custo iv = new ImpostoSobreVenda();
    private Custo seguro;
    private String estadoDoCliente;
    private double total;
    
    private void setEstadoDoCliente(String estadoDoCliente) {
        this.estadoDoCliente = estadoDoCliente;
    }
    
    public Custo getSeguro() {
        return seguro;
    }
    
    public void setSeguro(Custo seguro) {
        this.seguro = seguro;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public String getData() {
        return data;
    }
    
    public void addNoCarrinho(ItemVenda item, int posicao) {
        this.itens[posicao] = item;
    }
    
    public double getTotal() {
        return total;
    }
    
    public double calcularTotal() {
        total = 0.0;
        for (ItemVenda item: this.itens) {
            if (item != null) {
                total += item.getSubTotal();
            }
        }
        
        if ( this.iv != null) {
            total += this.iv.calcularCusto(this);
        }
        
        if ( this.seguro != null) {
            total += this.seguro.calcularCusto(this);
        }
        
        return total;
    }
    public String getEstadoDoCliente() {
        return estadoDoCliente;
    }
    
    
    
    
    
    
    
    
    
}
