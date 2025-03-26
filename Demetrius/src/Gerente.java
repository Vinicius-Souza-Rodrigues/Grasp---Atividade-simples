import java.util.List;

class Gerente {
    public void realizarPedido(Cliente cliente, List<ItemPedido> itens) {
        Pedido pedido = new Pedido(cliente);
        for (ItemPedido item : itens) {
            pedido.adicionarItem(item.descricao, item.preco);
        }
        double total = pedido.calcularTotal();
        System.out.println("Pedido para " + cliente.getNome() + "valor: R$" + total);
    }
}