public class Seguro implements Custo {

    private String nome;
    private double taxa;
    
    public Seguro(String nome, double taxa) {
        this.nome = nome;
        this.taxa = taxa;
    }
    
    public double calcularCusto(Venda venda) {
        return venda.getTotal() * taxa;
    }
    
}
