package segundo_prototipo;

public class Venda {
    private String numeroVenda;
    private Cliente cliente;
    private Produto produto;
    // private LocalDate dataVenda;
    private Double valorTotalProdutos;

    public void xixi() {
        System.out.println("Número da Venda: " + numeroVenda + "\n" + "Nome do cliente: " + cliente.getNome() + "\n"
                + "Preço do produto: " + produto.getPreco());
    }

    /**
     * @return the numeroVenda
     */
    public String getNumeroVenda() {
        return numeroVenda;
    }

    /**
     * @param numeroVenda the numeroVenda to set
     */
    public void setNumeroVenda(String numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the dataVenda
     */
    // public LocalDate getDataVenda() {
    // return dataVenda;
    // }

    /**
     * @param dataVenda the dataVenda to set
     */
    // public void setDataVenda(LocalDate dataVenda) {
    // this.dataVenda = dataVenda;
    // }

    /**
     * @return the valorTotalProdutos
     */
    public Double getValorTotalProdutos() {
        return valorTotalProdutos;
    }

    /**
     * @param valorTotalProdutos the valorTotalProdutos to set
     */
    public void setValorTotalProdutos(Double valorTotalProdutos) {
        this.valorTotalProdutos = valorTotalProdutos;
    }

}
