
public class ModoCarrito implements EstadoShopping{
	public PaginaPais pagina;

	
	public ModoCarrito(PaginaPais paginaPais) {
		this.pagina = paginaPais;
	}

	@Override
	public void catalogo() {
		pagina.mostrarCatalogo();
		System.out.println(pagina.opcionesComprar());
	}

	@Override
	public void agregarAlCarro() {
		pagina.mostrarCatalogo();
		pagina.agregarProductoAlCarro();;
		pagina.setCarritoOcupado(true);
	}

	@Override
	public void pagar() {
		if(pagina.isCarritoOcupado()) {
			pagina.asignarNuevoEstado(pagina.getModoPagar());
		}else {
			System.out.println(pagina.mensajeCarroVacio());
		}
		
		
	}

	@Override
	public void salir() {
		System.out.println(pagina.Despedirse());
		pagina.setSalirTienda(true);
	}


}
