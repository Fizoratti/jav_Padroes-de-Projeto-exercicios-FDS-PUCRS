import java.util.function.Predicate;
import java.util.List;

public class Pessoa {

    public enum Genero {
        MASC, FEM
    }

    public String nome;
    public int idade;
    public Genero genero;

    public Pessoa(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public int getIdade() {
        return this.idade;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public void printPessoa() {
        System.out.println(nome + ", " + idade + ", " + genero);
    }

    public static void printPessoas(List<Pessoa> lista, Predicate<Pessoa> tester) {
        for (Pessoa p : lista) {
            if (tester.test(p)) {
                p.printPessoa();
            }
        }
    }
}