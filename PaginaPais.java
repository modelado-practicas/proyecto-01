import java.util.Iterator;
import java.util.Scanner;

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

	private CatalogoProxy catalogo;
	private CarritoDeCompras carrito;
	
	
	public PaginaPais(Usuario UsuarioAtendido) {
		user = UsuarioAtendido;
		carritoOcupado = false;
		compraPagada = false;
		salirTienda = false;
		
		modoInicial = new ModoInicial(this);
		modoCarrito = new ModoCarrito(this);
		modoPagar = new ModoPagar(this);
		
		estadoActual = modoInicial;

		Catalogo catalogoReal = new Catalogo();
		catalogo = new CatalogoProxy(catalogoReal);
		carrito = new CarritoDeCompras();
	
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
		Iterator itCatalogo = catalogo.getIterator();
		System.out.println("");
		while(itCatalogo.hasNext()){
			Producto producto = (Producto)itCatalogo.next();
			System.out.println(producto.toString());
		}
		System.out.println("");
	}
	
	public String opcionesComprar() {
		return user.getPaisOrigen().realizarCompra();
	}
	
	public String mensajeAgregarProducto () {
		return user.getPaisOrigen().agregarAlCarro();
	}

	private Producto buscarProducto(String codigo){
		Iterator itCatalogo = catalogo.getIterator();
		Producto p = null;
		
		while(itCatalogo.hasNext()){
			Producto producto = (Producto)itCatalogo.next();
			if(producto.getCodigo().equals(codigo)){
				p = producto;
				break;
			}
		}
		return p;
	}
	//Metodo para agregar productos al carrito (Decorator)
	public void agregarProductoAlCarro(){
		Scanner sc = new Scanner(System.in);
		System.out.println(user.getPaisOrigen().agregarAlCarro());
		String codigo_producto = sc.nextLine();
		Producto producto = buscarProducto(codigo_producto);
		if(producto != null){
			carrito.agregarProducto(producto);
		}else{
			System.out.println(user.getPaisOrigen().productoNoEncontrado());
		}
		
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
		ProductoIterator productos = carrito.getIterator();
		System.out.println("-------------------------------------------");
		System.out.println(user.getPaisOrigen().encabezadoTicket());
		while (productos.hasNext()){
			Producto p = productos.next();
			System.out.println("["+p.getNombre()+" ....... $"+p.getPrecio()+"]");
		}
		System.out.println("Total: $"+carrito.getTotal());
		System.out.println("-------------------------------------------");
	}
	
	
	
	//metodo para mostrar la oferta si tiene el usuario
	public void mostrarOferta() {
		if(user.getOferta() != null){
			System.out.println(user.getPaisOrigen().mandarOferta());
		}
		//si el usurio no tiene ofertas, que esto no haga nada
	}
	
	//metodo para aplicar descuentos
	public void aplicarOferta() {
		//que muestre el precio final si se aplico una oferta,
		//de lo contrario que no haga nada
		ProductoIterator productos = carrito.getIterator();
		
		if(user.getOferta() != null){
			double descuento = 0;
			while(productos.hasNext()){
				Producto p = productos.next();
				if(user.getOferta().getDepartamento().equals(p.getDepartamento())){
					descuento += p.getPrecio() * (user.getOferta().getPorcentaje()/100);
				}
			}
			System.out.println("["+user.getPaisOrigen().precioTotalConDescuento()+" 	$"+(carrito.getTotal()-descuento)+"]");
		}
	}
	
	public String mensajeDatosBanco() {
		return user.getPaisOrigen().datosBancarios();
	}
	
	//metodo que verifica el pago
	public void verificarPagoSeguro() {
		Scanner sc = new Scanner(System.in);
		System.out.println(mensajeDatosBanco());
		String cuenta = sc.nextLine();

		compraPagada = (cuenta.equals(user.getCuentaBancaria())) ? true : false;
		
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

	public EstadoShopping getEstadoActual() {
		return estadoActual;
	}
	
	

}
