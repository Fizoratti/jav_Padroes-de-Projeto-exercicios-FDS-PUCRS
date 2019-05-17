import java.util.ArrayList;

public class Comida {
    private String nome;
    private ArrayList<Produto> produtos;

    public Comida(String nome, Produto p1, Produto p2, Produto p3) {
        setNome(nome);
        produtos = new ArrayList<Produto>(3);
        produtos.set(0, p1);
        produtos.set(1, p2);
        produtos.set(2, p3);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return new String(this.nome);
    }
}