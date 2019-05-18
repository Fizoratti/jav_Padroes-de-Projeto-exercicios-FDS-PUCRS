public class Atendente {
	
	private PedidoBuilder pedidoBuilder;

	public void setpedidoBuilder(PedidoBuilder pb) {
    	pedidoBuilder = pb;
    }

    public Pedido getPedido() {
        return pedidoBuilder.getPedido();
    }

    public void criaPedido(String ham, String bat, String brin) {
    	pedidoBuilder.criaNovoPedido();
    	pedidoBuilder.fazBatata(bat);
    	pedidoBuilder.fazHamburguer(ham);
    	pedidoBuilder.fazBrinquedo(brin);
    }
}
