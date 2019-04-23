import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String args[]) {

        AbstractFactory factory = new ConcreteFactory();

        System.out.println("(1) na tela ou (2) num arquivo");

        int option = (new Scanner(System.in)).nextInt();

        if(option == 1) System.out.println("Hello World");
        if(option == 2) factory.printFile();
        
    }
}