public class ItemVenda {

    private double quantidade;
    private Produto produto;
    private double precoVenda;
    
    protected double getSubTotal() {
        return this.getQuantidade() * this.getPrecoVenda();
    }
    
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getQuantidade() {
        return quantidade;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setProduto(Produto produto) {
        setPrecoVenda(produto.getPrecoReferencia());
        this.produto = produto;
    }
    
    public Produto getProduto() {
        return produto;
    }
    
}
