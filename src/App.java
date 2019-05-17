import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class App {
    public static void main(String args[]) {
        System.out.println("# Exercicio 1.2");

        AbstractFactory factory = new ConcreteFactory();

        int dia = Integer.parseInt(args[0]);
        int mes = Integer.parseInt(args[1]);
        int ano = Integer.parseInt(args[2]);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");

        try {
            Date data = simpleDateFormat.parse(dia+"-"+mes+"-"+ano);
            String dataString = simpleDateFormat.format(data);
            System.out.println("Data: "+dataString);
        }
        catch (ParseException e) {
            // Normal Auto-generated catch block
            e.printStackTrace();
        }



        

        // System.out.println("(1) na tela ou (2) num arquivo");

        // /* Pulando a opção de escolher o método
        // int option = (new Scanner(System.in)).nextInt();
        // */

        // System.out.println("Gerando opcao randomica...");

        // double option = Math.random();

        // if(option > 0.5) System.out.println("Hello World");
        // if(option <= 0.5) factory.printFile();

        // if(option > 0.5) System.out.println("Escrito na tela.");
        // if(option <= 0.5) System.out.println("Escrito no arquivo.");
        
    }
}