public abstract class PedidoBuilder {
	
	protected Pedido pedido;
	
	public Pedido getPedido() {
		return pedido;
	}
	
	public void criaNovoPedido() {
		pedido = new Pedido();
	}
	
	public abstract void fazHamburguer(String carne);
    public abstract void fazBatata(String tamanho);
    public abstract void fazBrinquedo(String brinde);

}
