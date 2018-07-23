public class Produto {

    private int id;
    private String descricao;
    private double precoReferencia;
    
    public Produto() { }
    
    public Produto(int id, String descricao, double precoReferencia) {
        this.id = id;
        this.descricao = descricao;
        this.precoReferencia = precoReferencia;
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
    
    public void setPrecoReferencia(double precoReferencia) {
        this.precoReferencia = precoReferencia;
    }
    
    public double getPrecoReferencia() {
        return precoReferencia;
    }
    
    public void reajustarPreco(double percentual) {
        double reajuste = getPrecoReferencia() * (percentual / 100);
        setPrecoReferencia(getPrecoReferencia() + reajuste);
    }

}
