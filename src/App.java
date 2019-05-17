import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class App {
    private static Date data;
    private static String status;
    private static Pizzaiolo pizzaiolo1, pizzaiolo2;

    public static void main(String args[]) {
        System.out.println("# Exercicio 1.2");

        int dia = Integer.parseInt(args[0]);
        int mes = Integer.parseInt(args[1]);
        int ano = Integer.parseInt(args[2]);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");

        try {
            data = simpleDateFormat.parse(dia+"-"+mes+"-"+ano);
            String dataString = simpleDateFormat.format(data);
            System.out.println("Data: "+dataString);
        }
        catch (ParseException e) {
            // Normal Auto-generated catch block
            e.printStackTrace();
        }

        AbstractFactory factory = new ConcreteFactory();

        factory.start();

        factory.espiarPizzaria();

        factory.mostrarIngred();

        
    }

    public static Date getDate() {
        return data;
    }

    public static void setStatus(String s) {
        status = s;
    }

    public static String getStatus() {
        return status;
    }

    public static void setPizzaiolo1(Pizzaiolo p) {
        pizzaiolo1 = p;
    }

    public static Pizzaiolo getPizzaiolo1() {
        return pizzaiolo1;
    }

    public static void setPizzaiolo2(Pizzaiolo p) {
        pizzaiolo2 = p;
    }

    public static Pizzaiolo getPizzaiolo2() {
        return pizzaiolo2;
    }

    
}