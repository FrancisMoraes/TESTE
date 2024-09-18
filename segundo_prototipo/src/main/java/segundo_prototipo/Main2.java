package segundo_prototipo;

public class Main2 {
    public static void main(String[] args) {
        Cliente ifg = new Cliente();
        ifg.setCPF(123);
        ifg.setEndereco("Rua X");
        ifg.setNome("Flávio");
        ifg.setTelefone("666666");
        ifg.Salvar();

        Produto xuxu = new Produto();
        xuxu.setCodigo("1111");
        xuxu.setNome("Garrafa 500ML Tapuer");
        xuxu.setPreco(50.0);

        Venda venda = new Venda();
        venda.setNumeroVenda("123456");
        venda.setCliente(ifg);
        venda.setProduto(xuxu);
        venda.xixi();
    }
}
