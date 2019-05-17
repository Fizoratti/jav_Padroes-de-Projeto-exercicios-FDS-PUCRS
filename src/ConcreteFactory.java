import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Calendar;

public class ConcreteFactory extends AbstractFactory{

    @Override
    public void start() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(App.getDate());
        int dia = cal.get(Calendar.DAY_OF_WEEK);
        if(dia == 7) {
            App.setStatus("Fechada");
        }else{
            App.setStatus("Aberta");
            App.setPizzaiolo1(new Pizzaiolo("Robson", 1));
            App.setPizzaiolo2(new Pizzaiolo("Pedro", 2));
        }
    }

    @Override
    public void espiarPizzaria() {
        System.out.println("Pizzaria " + App.getStatus());
    }

    @Override
    public void mostrarIngred() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(App.getDate());
        int dia = cal.get(Calendar.DAY_OF_WEEK);
        switch(dia){
            case 1:
                System.out.println("Sem ingredientes");
            case 2:
            case 4:
            case 6:
                Comida pizza = new Pizza();
                System.out.println(pizza.getProdutos(0));
                System.out.println(pizza.getProdutos(1));
                System.out.println(pizza.getProdutos(2));
                break;
            case 3:
            case 5:
            case 7:
                Comida calzone = new Calzone();
                System.out.println(calzone.getProdutos(0));
                System.out.println(calzone.getProdutos(1));
                System.out.println(calzone.getProdutos(2));
                break;
            default:
                break;
        }
    }
}