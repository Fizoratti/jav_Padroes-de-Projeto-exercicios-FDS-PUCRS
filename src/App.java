import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.lang.Math;

public class App {
    public static void main(String args[]) {

        System.out.println("# Exercício 2.1");

        Scanner sc = new Scanner(System.in);
		
		System.out.println("Fa�a Seu Pedido");
		System.out.println("Qual hamburguer voc� deseja:");
		System.out.println("1 - Hamb�rguer");
		System.out.println("2 - Cheeseburger");
		String ham = sc.nextLine();
		
		System.out.println("Qual tamanho da batata:");
		System.out.println("1 - Pequena");
		System.out.println("2 - Media");
		System.out.println("3 - Grande");
		String bat = sc.nextLine();
		
		
		System.out.println("Qual refrigerante voc� deseja:");
		System.out.println("1 - Coca");
		System.out.println("2 - Guaran�");
		String brin = sc.nextLine();

		
		Atendente atend = new Atendente();
		PedidoBuilder pb = new Montador();
		
		atend.setpedidoBuilder(pb);
		atend.criaPedido(ham, bat, brin);
		
		sc.close();
		
		System.out.println(atend.getPedido().toString());
    }
}
