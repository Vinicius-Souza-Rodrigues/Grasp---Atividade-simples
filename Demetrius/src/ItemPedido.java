class ItemPedido {
    protected String descricao;
    protected double preco;

    public ItemPedido(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}