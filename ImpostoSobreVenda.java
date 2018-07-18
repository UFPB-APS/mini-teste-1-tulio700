public class ImpostoSobreVenda implements Custo {
    
    public double calcularCusto(Venda venda) {
        return venda.getTotal() * 0.05;
    }
}
