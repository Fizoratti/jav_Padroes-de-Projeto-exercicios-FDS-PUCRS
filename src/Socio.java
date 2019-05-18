public class Socio extends Cliente {
	private double milhagens;
	private int nSocio;

	public Socio() {
		
	}

	public Socio(String nome, String cpf, int idade, char genero, int nSocio){
		super(nome, cpf, idade, genero);
		this.nSocio = nSocio;
	}

	public double getMilhagens() {
		return milhagens;
	}

	public void setMilhagens(double milhagens) {
		this.milhagens = milhagens;
	}

	public int getnSocio() {
		return nSocio;
	}

	public void setnSocio(int nSocio) {
		this.nSocio = nSocio;
	}
}
