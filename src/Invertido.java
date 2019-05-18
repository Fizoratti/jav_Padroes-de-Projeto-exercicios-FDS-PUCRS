public class Invertido extends NomeCompleto {
	String nome;
	private String cortes[] = new String[1];

	public Invertido(String nome) {
		cortes =  nome.split(", ");
		this.nome = cortes[1];
		sobrenome = cortes[0];
	}

	public String getNome() {
		return cortes[1] + " " + cortes[0];
	}
	
}
