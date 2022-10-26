
public class Espana implements Pais{
	private String Saludo = "Bienvenios a CheemsMart. Yo soy Cheemma, "
			+ "estoy aqui para orientarte en lo que necesites.";
	private String Despedida = "Agradecemos mucho tu preferencia tí@, tened un excelente dia.\n"
			+ "Volved pronto :)";
	private String CompraTerminada = "Tu pago ha sido recibido correctamente.\n"
			+ "Gracias por comprar con nosotros.";
	private String FechaEntrega = "No os preocupéis, tus productos ya están siendo empacados y "
			+ "los mandaremos lo más rápido posible. \n"
			+ "Debido a la pandemia, nuestros tiempos de espera rondan entre los 2 y 7 dias habiles.";
	private String Oferta = "¡¡¡Enhorabuena!!!\n"
			+ "Has sido uno de los pocos premiados con un descuento en el departamento de "
			+ "electrodomesticos.";

	
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
