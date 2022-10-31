
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
	private String Menu = "1. ver catalogo.\n"
			+ "2. Realizar compra.\n"
			+ "0. Salir.\n"
			+ "Selecciona la opcion que deseais ejecutar: ";
	private String RealizarCompra = "1. Agregar producto al carrito.\n"
			+ "2. Pagar.\n"
			+ "0. Salir.\n"
			+ "Selecciona la opcion que deseais ejecutar: ";
	private String AgregarAlCarro = "Ingresa el numero del articulo que te "
			+ "gustaria agregar a tu carrito compras: ";
	private String CarroVacio = "Tu carrito esta vacio, intentad agregar algunos articulos.";
	private String datosBanco = "Ingresa tu cuenta bancaria para finalizar tu compra: ";
	private String PagoRechazado = "Vaya tio... .___. \nAlgo ha salido mal y no hemos podido completar tu pago.";
	private String productoNoEncontrado = "Producto no encontrado";
	private String encabezadoTicket = "Producto               Precio";
	private String precioTotalConDescuento = "Precio total con descuento: ";

	
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
