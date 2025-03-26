import java.util.ArrayList;
import java.util.List;

class Pedido {
    private static final double TAXA_SERVICO = 0.1;
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String descricao, double preco) {
        itens.add(new ItemPedido(descricao, preco));
    }

    public double calcularTotal() {
        double subtotal = itens.stream().mapToDouble(ItemPedido::getPreco).sum();
        double taxa = subtotal * TAXA_SERVICO;
        return subtotal + taxa;
    }

    public Cliente getCliente() {
        return cliente;
    }
}