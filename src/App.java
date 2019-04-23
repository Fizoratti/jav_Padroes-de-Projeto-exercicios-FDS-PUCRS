import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String args[]) {

        AbstractFactory factory = new ConcreteFactory();
        factory.printScreen();
        factory.printFile();

        System.out.println("(1) na tela ou (2) num arquivo");

        String option = (new Scanner(System.in)).next();

        ler.close();

        System.out.println(texto);

    }
}