package segundo_prototipo;

public class Pagamento {
    private String nomeFormaPagamento;
    private Double valorPago;
    private Venda venda;

    /**
     * @return the nomeFormaPagamento
     */
    public String getNomeFormaPagamento() {
        return nomeFormaPagamento;
    }

    /**
     * @param nomeFormaPagamento the nomeFormaPagamento to set
     */
    public void setNomeFormaPagamento(String nomeFormaPagamento) {
        this.nomeFormaPagamento = nomeFormaPagamento;
    }

    /**
     * @return the valorPago
     */
    public Double getValorPago() {
        return valorPago;
    }

    /**
     * @param valorPago the valorPago to set
     */
    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    /**
     * @return the venda
     */
    public Venda getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(Venda venda) {
        this.venda = venda;
    }
}
