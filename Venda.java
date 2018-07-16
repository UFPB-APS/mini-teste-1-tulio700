public class Venda {

    private String data;
    private ItemVenda[] itens = new ItemVenda[10];
    
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
        double total = 0.0;
        for (ItemVenda item: this.itens) {
            if (item != null) {
                total += item.getQuantidade() * item.getProduto().getPreco();
            }
        }
        return total;
    }
}
