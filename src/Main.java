import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static Bar bar;

	public static void main(String[] args) throws IOException {
		bar = new Bar();

		Cliente c1 = new Cliente("Pedro2", "12345", 24, 'm');
		Cliente c2 = new Cliente("Tati2", "01010", 24, 'f');
		Cliente c3 = new Cliente("Will2", "54321", 24, 'm');
		Cliente s1 = new Socio("Jorge2", "12345", 24, 'm', 10);
		Cliente s2 = new Socio("Bruna2", "01110", 24, 'f', 20);
		Cliente s3 = new Socio("Vic2", "54321", 24, 'f', 30);
		bar.entraBar(c1);
		bar.entraBar(s1);
		bar.entraBar(c2);
		bar.entraBar(s2);
		bar.entraBar(c3);
		bar.entraBar(s3);
		bar.sair(c1.getCpf());
		bar.sair(c2.getCpf());
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		
		while(i != 0) {
			System.out.println("Teste de persist�ncia do Bar: \n");
			System.out.println("Escrita de arquivo: \n");
			
			bar.registraNoite();
			
			System.out.println("Escrita realizada! \n");
			System.out.println("Aperte 0 para sair \n");
			
			i = sc.nextInt();
			sc.close();
		}
		
		

	}

}
