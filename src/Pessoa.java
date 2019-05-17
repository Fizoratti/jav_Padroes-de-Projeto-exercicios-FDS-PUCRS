public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return new String(this.nome);
    }
}