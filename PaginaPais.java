import java.util.Iterator;

public class PaginaPais {
	private int opcion;
	private Usuario user;
	private boolean carritoOcupado;
	private boolean compraPagada;
	private boolean salirTienda;
	
	private EstadoShopping estadoActual;
	
	private EstadoShopping modoInicial;
	private EstadoShopping modoCarrito;
	private EstadoShopping modoPagar;
	
	
	public PaginaPais(Usuario UsuarioAtendido) {
		user = UsuarioAtendido;
		carritoOcupado = false;
		compraPagada = false;
		salirTienda = false;
		
		modoInicial = new ModoInicial(this);
		modoCarrito = new ModoCarrito(this);
		modoPagar = new ModoPagar(this);
		
		estadoActual = modoInicial;
		
		
	}
	
	public String Saludar() {
		return user.getPaisOrigen().saludar();
	}
	
	public String Despedirse() {
		return user.getPaisOrigen().despedirse();
	}
	
	
	public String opcionesMenu() {
		return user.getPaisOrigen().menu();
	}
	
	//metodo para imprimir catalogo
	public void mostrarCatalogo() {
		Catalogo catalogo = new Catalogo();
		Iterator itCatalogo = catalogo.getIterator();
		int i =1;
		while(itCatalogo.hasNext()){
			Producto producto = (Producto)itCatalogo.next();
			System.out.println("["+i+"] "+producto.toString());
			i++;
		}
	}
	
	public String opcionesComprar() {
		return user.getPaisOrigen().realizarCompra();
	}
	
	public String mensajeAgregarProducto () {
		return user.getPaisOrigen().agregarAlCarro();
	}
	
	//Metodo para agregar productos al carrito (Decorator)
	public void agregarProductoAlCarro() {
		//que acepte el numero del articulo y lo agregue
	}
	
	public String mensajeCarroVacio() {
		return user.getPaisOrigen().carroVacio();
	}
	
	public String mensajeCompraExitosa () {
		return user.getPaisOrigen().finalizarCompra();
	}
	
	public String mensajeEntrega () {
		return user.getPaisOrigen().estimarEntrega();
	}
	
	
	//metodo que hace el desgloce lo del carrito y el costo(decorator) 
	public void ticket() {
		
	}
	
	
	
	//metodo para mostrar la oferta si tiene el usuario
	public void mostrarOferta() {
		//si el usurio no tiene ofertas, que esto no haga nada
	}
	
	//metodo para aplicar descuentos
	public void aplicarOferta() {
		//que muestre el precio final si se aplico una oferta,
		//de lo contrario que no haga nada
	}
	
	public String mensajeDatosBanco() {
		return user.getPaisOrigen().datosBancarios();
	}
	
	//metodo que verifica el pago
	public void verificarPagoSeguro() {
		/*
		 * acepta el numero de la cuenta bancaria
		 * si se verifica cambia el valor de compraPagada
		 */
		/*
		 * if ...{
		 * 		...
		 * 		compraPagada = True
		 */
		
	}
	
	public String errorPago() {
		return user.getPaisOrigen().errorPago();
	}
	
	

	public boolean isCarritoOcupado() {
		return carritoOcupado;
	}

	public void setCarritoOcupado(boolean carritoOcupado) {
		this.carritoOcupado = carritoOcupado;
	}

	public boolean isCompraPagada() {
		return compraPagada;
	}

	public void setCompraPagada(boolean compraPagada) {
		this.compraPagada = compraPagada;
	}

	public boolean isSalirTienda() {
		return salirTienda;
	}

	public void setSalirTienda(boolean salirTienda) {
		this.salirTienda = salirTienda;
	}
	
	
	
	public void asignarNuevoEstado(EstadoShopping estadoNuevo) {
		estadoActual = estadoNuevo;
	}
	
	
	public void catalogo() {
		estadoActual.catalogo();
	}
	
	public void comprar() {
		estadoActual.agregarAlCarro();
	}
	
	public void pagar() {
		estadoActual.pagar();
	}
	
	public void salir() {
		estadoActual.salir();
	}

	
	public EstadoShopping getModoInicial() {
		return modoInicial;
	}


	public EstadoShopping getModoCarrito() {
		return modoCarrito;
	}

	public EstadoShopping getModoPagar() {
		return modoPagar;
	}
	
	

}
