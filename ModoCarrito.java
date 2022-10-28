
public class ModoCarrito implements EstadoShopping{
	public PaginaPais pagina;

	
	public ModoCarrito(PaginaPais paginaPais) {
		this.pagina = paginaPais;
	}

	@Override
	public void catalogo() {
		pagina.mostrarCatalogo();
		pagina.opcionesComprar();
	}

	@Override
	public void agregarAlCarro() {
		pagina.mostrarCatalogo();
		pagina.mensajeAgregarProducto();
		pagina.agregarProductoAlCarro();;
		pagina.setCarritoOcupado(true);
	}

	@Override
	public void pagar() {
		if(pagina.isCarritoOcupado()) {
			pagina.asignarNuevoEstado(pagina.getModoPagar());
		}else {
			pagina.mensajeCarroVacio();
			pagina.catalogo();
		}
		
		
	}

	@Override
	public void salir() {
		pagina.Despedirse();
		pagina.setSalirTienda(true);
	}


}
