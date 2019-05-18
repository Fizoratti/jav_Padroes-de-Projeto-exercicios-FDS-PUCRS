import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.lang.Math;

public class App {
    public static void main(String args[]) {

        System.out.println("# Exercício 3.1");

        FactoryNome fabrica = new FactoryNome();
		String n1 = "Sasso, Pedro";
		String n2 = "Robsu Felipo";
		
		System.out.println("Nome com virgula: /n");
		System.out.println(fabrica.criaNome(n1).getNome());
		
		System.out.println("Nome normal: /n");
        fabrica.criaNome(n2);
        
    }
}
