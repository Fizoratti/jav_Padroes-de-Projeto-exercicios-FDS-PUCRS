public class Pizza extends Comida {
    private String nome = "Pizza";

    public Pizza(String nome) {
        super(nome, new Queijo(), new Calabresa(), new Tomate());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return new String(this.nome);
    }
}