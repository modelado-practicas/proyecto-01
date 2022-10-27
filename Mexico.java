
public class Mexico implements Pais{
	private String Saludo = "Bienvenios a CheemsMart. Yo soy Cheemente y "
			+ "estoy aqui para lo que ocupes, solo echa un grito y aqui estare.";
	private String Despedida = "Muchas gracias por escoger CheemsMart sobre la commmpetencia.\n"
			+ "Vuelva pronto padrino :)";
	private String CompraTerminada = "Desearias donar 5 pesos?...¿No? Vale.\n"
			+ "Hemos checado tus billetes a contraluz la luz y son verdaderos.\n"
			+ "Muchas gracias por comprar en CheemsMart, bonito dia.";
	private String FechaEntrega = "Paciencia herma, ya casi tenemos listos tus productos.\n"
			+ "Nuestros tiempos de espera son entre 2 a 3 dias habiles.";
	private String Oferta = "¡¡¡Siuuuuuu como dice el bicho!!!\n"
			+ "Eres uno de los afortunados en obtener un descuento en el departamento de abarratos.";
	private String Menu = "1. ver productos.\n"
			+ "2. Comprar.\n"
			+ "3. Salir.";
	private String RealizarCompra = "1. Agregar producto a la cesta.\n"
			+ "2. Pagar.\n"
			+ "3. Salir.";
	private String AgregarAlCarro = "Ingresa el numero del producto que te "
			+ "gustaria agregar a tu cesta de compras: ";

	
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
}