
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
	
	private String Menu = "1. Show me the catalog.\n"
			+ "2. Make a purchase.\n"
			+ "0. Exit.\n"
			+ "Enter the option you would like to execute: ";
	private String RealizarCompra = "1. Add a product tu the cart.\n"
			+ "2. Pay.\n"
			+ "0. Exit.\n"
			+ "Enter the option you would like to execute: ";
	private String AgregarAlCarro = "Please enter the number of the "
			+ "product you would like to add to the shopping cart: ";
	private String CarroVacio = "Your cart is empty, try adding a product.";
	private String datosBanco = "Please enter your bank account information to complete the transaction: ";
	private String PagoRechazado = "Ups... .___. \nSomething when wrong with your payment.";
	private String productoNoEncontrado = "product not found";
	private String encabezadoTicket = "Product               Price";
	private String precioTotalConDescuento = "Total with discount: ";

	
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
	
	public String getMenu() {
		return Menu;
	}

	public String getRealizarCompra() {
		return RealizarCompra;
	}
	

	public String getAgregarAlCarro() {
		return AgregarAlCarro;
	}
	
	

	public String getCarroVacio() {
		return CarroVacio;
	}
	

	public String getDatosBanco() {
		return datosBanco;
	}

	public String getPagoRechazado() {
		return PagoRechazado;
	}

	@Override
	public String saludar() {
		return getSaludo();
	}

	@Override
	public String despedirse() {
		return getDespedida();
	}

	@Override
	public String finalizarCompra() {
		return getCompraTerminada();
	}

	@Override
	public String estimarEntrega() {
		return getFechaEntrega();
	}

	@Override
	public String mandarOferta() {
		return getOferta();
	}

	@Override
	public String menu() {
		return getMenu();
	}

	@Override
	public String realizarCompra() {
		return getRealizarCompra();
	}

	@Override
	public String agregarAlCarro() {
		return getAgregarAlCarro();
	}

	@Override
	public String carroVacio() {
		return getCarroVacio();
	}

	@Override
	public String datosBanco() {
		return getDatosBanco();
	}

	@Override
	public String errorPago() {
		return getPagoRechazado();
	}

	@Override
	public String productoNoEncontrado() {
		return productoNoEncontrado;
	}

	@Override
	public String encabezadoTicket() {
		return encabezadoTicket;
	}

	@Override
	public String precioTotalConDescuento() {
		return precioTotalConDescuento;
	}
}