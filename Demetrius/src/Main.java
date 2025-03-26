import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joao silva");

        List<ItemPedido> itens = new ArrayList<>();
        itens.add(new ItemPedido("hamburguer", 25.0));
        itens.add(new ItemPedido("sopa", 5.0));

        Gerente garcom = new Gerente();
        garcom.realizarPedido(cliente, itens);
    }
}