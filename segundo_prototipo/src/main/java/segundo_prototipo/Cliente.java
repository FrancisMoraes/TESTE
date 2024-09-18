package segundo_prototipo;

public class Cliente {
    private String nome;
    private int CPF;
    private String endereco;
    private String telefone;

    public void Salvar() {
        System.out.println(nome + " - " + CPF + " - " + endereco + " - " + telefone);
    }

    public void Salvar(String nome) {
        System.out.println("Salvei somente o nome");
    }

    public void Salvar(String nome, String CPF) {
        System.out.println("Salvei nome e CPF");
    }

    public void Salvar(String nome, String CPF, String endereco) {
        System.out.println("Salvei nome, CPF e endereço");
    }

    public void Salvar(String nome, String CPF, String endereco, String telefone) {
        System.out.println("Salvei nome, CPF, endereço e telefone");
    }

    public void Alterar() {
        System.out.println("Alterei");
    }

    public void Excluir() {
        System.out.println("Exclui");
    }

    public void Pesquisar() {
        System.out.println("Pesquisei");
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cPF
     */
    public int getCPF() {
        return CPF;
    }

    /**
     * @param cPF the cPF to set
     */
    public void setCPF(int cPF) {
        CPF = cPF;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
