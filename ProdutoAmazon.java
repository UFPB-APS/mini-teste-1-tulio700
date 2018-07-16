public class ProdutoAmazon extends Produto {
    
    public ProdutoAmazon() {
        super();
    }
    
    public ProdutoAmazon(int id, String descricao, double preco) {
        super(id, descricao, preco);
    }
    
    public void reajustarPreco(double percentual) {
        
        if (percentual > 0) {    
            super.reajustarPreco(percentual);
        }        
    }
    
}
