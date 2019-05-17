public class Produto {
    private String nome;

    public Produto(String nome) {
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return new String(this.nome);
    }
}