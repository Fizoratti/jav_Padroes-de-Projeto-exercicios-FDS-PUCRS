import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String args[]) {

        Message message = new Message("Hello World!");
        System.out.println(message.getMessage());

        Scanner ler = new Scanner(System.in);

        String texto = ler.next();

        ler.close();

        System.out.println(texto);

    }
}