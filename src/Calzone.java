public class Calzone extends Comida {
    private String nome = "Calzone";

    public Calzone(String nome) {
        super(nome, new Queijo(), new Presunto(), new Tomate());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return new String(this.nome);
    }
}