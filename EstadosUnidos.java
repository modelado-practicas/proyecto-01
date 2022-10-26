
public class EstadosUnidos implements Pais{
	private String Saludo = "Welcome to CheemsMart. I am cheemstocker, your "
			+ "personal assistant.\n"
			+ "I am here to help you to get everything you need...\n"
			+ "and the things you don't need.";
	private String Despedida = "Thanks for choosing CheemsMart.\n "
			+ "We hope you got everything that you were looking for.\n "
			+ "Come back soon, and have a CheemsMart day :)";
	private String CompraTerminada = "The payment has come through successfully. \n "
			+ "Thank you for shopping at ChecksMart :)";
	private String FechaEntrega = "As you read this message, we are shipping your products. \n"
			+ "Please be patient, we are doing our best to deliver your products. \n"
			+ "Due to COVID-19, our standard shipping periods are between 3 and 5 business days.";
	private String Oferta = "Congratulations!!!\n "
			+ "You are one of the lucky few to get a discount on "
			+ "an item in the electronics department.";

	
	private String getSaludo() {
		return Saludo;
	}

	private String getDespedida() {
		return Despedida;
	}

	private String getCompraTerminada() {
		return CompraTerminada;
	}

	private String getFechaEntrega() {
		return FechaEntrega;
	}

	private String getOferta() {
		return Oferta;
	}

	@Override
	public String Saludar() {
		return getSaludo();
	}

	@Override
	public String Despedirse() {
		return getDespedida();
	}

	@Override
	public String FinalizarCompra() {
		return getCompraTerminada();
	}

	@Override
	public String EstimarEntrega() {
		return getFechaEntrega();
	}

	@Override
	public String MandarOferta() {
		return getOferta();
	}
	

}
