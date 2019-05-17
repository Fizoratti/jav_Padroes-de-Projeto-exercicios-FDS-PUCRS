import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.lang.Math;

public class App {
    public static void main(String args[]) {

        AbstractFactory factory = new ConcreteFactory();

        System.out.println("# Exercício 1.1");

        System.out.println("(1) na tela ou (2) num arquivo");

        /* Pulando a opção de escolher o método
        int option = (new Scanner(System.in)).nextInt();
        */

        System.out.println("Gerando opcao randomica...");

        double option = Math.random();

        if(option > 0.5) factory.printScreen();
        if(option <= 0.5) factory.printFile();

        if(option > 0.5) System.out.println("Escrito na tela.");
        if(option <= 0.5) System.out.println("Escrito no arquivo.");
        
    }
}
