
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
			pagina.ticket();
			pagina.mostrarOferta();
			pagina.aplicarOferta();
			pagina.verificarPagoSeguro();
			if(pagina.isCompraPagada()) {
				System.out.println(pagina.mensajeCompraExitosa());
				pagina.ticket();
				pagina.mostrarOferta();
				pagina.aplicarOferta();
				System.out.println(pagina.mensajeEntrega());
				pagina.salir();
			}else {
				for (int i = 0; i < 2; i++) {
					System.out.println(pagina.errorPago());
					pagina.ticket();
					pagina.mostrarOferta();
					pagina.aplicarOferta();
					pagina.verificarPagoSeguro();
				}
				System.out.println(pagina.errorPago());
				pagina.salir();
			}
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
