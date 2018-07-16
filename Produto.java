public class Produto {

    private int id;
    private String descricao;
    private double preco;
    
    public Produto() { }
    
    public Produto(int id, String descricao, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void reajustarPreco(double percentual) {
        double reajuste = getPreco() * (percentual / 100);
        setPreco(getPreco() + reajuste);
    }

}
