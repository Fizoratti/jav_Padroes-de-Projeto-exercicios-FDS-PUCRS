public class Pessoa extends FabricaAbstrata {

	@Override
	public Cliente criaCliente() {
		return new Cliente();
	}

	@Override
	public Socio criaSocio() {
		return new Socio();
	}

}
