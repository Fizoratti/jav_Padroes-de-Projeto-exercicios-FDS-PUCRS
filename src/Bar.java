import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Bar {
	ArrayList<Cliente> listaPresenca = new ArrayList<Cliente>();
	ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
	private int nMasc;
	private int nSocios;
	FileWriter arquivo;
	PrintWriter gravador;

	public Bar() throws IOException {
		nMasc = 0;
		nSocios = 0;
		arquivo = new FileWriter("acessos.txt", true);
		gravador = new PrintWriter(arquivo);
	}

	public void entraBar(Cliente c) {

		if (c instanceof Socio) {
			nSocios++;
		}
		if (c.getGenero() == 'm') {
			nMasc++;
		}
		listaDeClientes.add(c);
	}
	
	public ArrayList<Cliente> getTodasPessoasBar(){
		return listaDeClientes;
	}

	public int getNumeroDeClientes() {
		return listaDeClientes.size();
	} 

	public double getPercentualMasculino() {
		return ((nMasc * 100) / listaDeClientes.size());
	}

	public double getPercentualFeminino() {
		int aux = listaDeClientes.size();
		return (((aux - nMasc) * 100) / aux);
	}

	public int getNumeroDeSocios() {
		return nSocios;
	}

	public int getPercentualNumeroSocios() {
		return ((nSocios * 100) / listaDeClientes.size());
	}
	
	public boolean buscaPorCpf(String cpf) {
		for (Cliente c : listaDeClientes) {
			if (c.getCpf().equals(cpf))
				return true;
		}
		return false;
	}

	public boolean sair(String cpf) {
		for (Cliente c : listaDeClientes) {
			if (c.getCpf().equals(cpf)) {
				listaPresenca.add(c);
				listaDeClientes.remove(c);
				if(c.getGenero()=='m'){
					nMasc--;
				}
				return true;
			}
		}
		return false;
	}
	
	
	public boolean registraNoite() {
		gravador.printf("----Registro de Clientes na Noite---- \n");
		
		for (Cliente c : listaDeClientes){
			gravador.printf("Nome: " + c.getNome() + " | " + c.getCpf() + "\n");
		}
		
		for (Cliente cc : listaPresenca){
			gravador.printf("Nome: " + cc.getNome() + " | " + cc.getCpf() + "\n");
		}
		gravador.printf("------------------------ \n" + "\n");
		gravador.close();
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
