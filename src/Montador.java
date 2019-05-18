public class Montador extends PedidoBuilder {

	@Override
	public void fazHamburguer(String carne) {
		pedido.adicionarDentroDaCaixa(carne);
	}

	@Override
	public void fazBatata(String tamanho) {
		pedido.adicionarDentroDaCaixa(tamanho);
	}

	@Override
	public void fazBrinquedo(String brinde) {
		pedido.adicionarForaDaCaixa(brinde);
	}
	

	
}
