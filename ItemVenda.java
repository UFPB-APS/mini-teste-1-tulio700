public class ItemVenda {

    private double quantidade;
    private Produto produto;
    
    protected double getSubTotal() {
        return this.getQuantidade() * this.getProduto().getPreco();
    }
    
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getQuantidade() {
        return quantidade;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Produto getProduto() {
        return produto;
    }
    
}
