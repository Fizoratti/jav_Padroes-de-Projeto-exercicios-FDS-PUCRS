package pacote;

public class FactoryNome {
	
	public nomeCompleto criaNome(String nome) {
		
		if(nome.indexOf(",") > 0) {
			return new Invertido(nome);
		} else {
			return new Normal(nome);
		}
	}

}
