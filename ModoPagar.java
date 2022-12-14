import java.util.Iterator;

public class ModoPagar implements EstadoShopping{
	public PaginaPais pagina;

	
	public ModoPagar(PaginaPais paginaPais) {
		this.pagina = paginaPais;
	}

	@Override
	public void catalogo() {
		//No es accesible al usuario

		
	}

	@Override
	public void agregarAlCarro() {
		//No es accesible al usurio
		
	}

	@Override
	public void pagar() {
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
			System.out.println();
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
		
	}

	@Override
	public void salir() {
		System.out.println(pagina.Despedirse());
		System.out.println();
		pagina.setSalirTienda(true);

	}


}
