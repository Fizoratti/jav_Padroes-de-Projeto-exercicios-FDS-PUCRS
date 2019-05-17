import java.util.ArrayList;

public class Comida {
    private ArrayList<Produto> produtos;

    public Comida(Produto p1, Produto p2, Produto p3) {
        produtos = new ArrayList<Produto>(3);
        this.produtos.add(p1);
        this.produtos.add(p2);
        this.produtos.add(p3);
    }
    
    public Produto getProdutos(int i) {
        return produtos.get(i);
    }
}