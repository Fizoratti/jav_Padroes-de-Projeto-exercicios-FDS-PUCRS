public class Normal extends NomeCompleto {
	String nome;
	private String cortes[] = new String[1];
	
	public Normal(String nome) {
		cortes =  nome.split(" ");
		this.nome = cortes[0];
		sobrenome = cortes[1];
	}
	
	public String getNome() {
		return cortes[0] + " " + cortes[1];
	}

}

