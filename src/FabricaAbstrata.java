abstract class FabricaAbstrata {
	private static final Cliente c = new Cliente();
	private static final Socio s = new Socio();
	
    static FabricaAbstrata getFactory(tipo t) {
    	FabricaAbstrata factory = null;
    	switch(t) {
            case CLIENTE:
                factory = c;
                break;
            case SOCIO:
                factory = s;
                break;
        }
        return factory;
    }

    public abstract Cliente criaCliente();

    public abstract Socio criaSocio();
}
	
	
	