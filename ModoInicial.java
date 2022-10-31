
public class ModoInicial implements EstadoShopping{
	public PaginaPais pagina;

	
	public ModoInicial(PaginaPais paginaPais) {
		this.pagina = paginaPais;
	}

	@Override
	public void catalogo() {
		pagina.mostrarCatalogo();
	}

	@Override
	public void agregarAlCarro() {
		pagina.asignarNuevoEstado(pagina.getModoCarrito());
	}

	@Override
	public void pagar() {
		/*
		 * Esta opcion no esta disponible, asi que el usuario 
		 * no puede acceder a ella
		 */
		
	}

	@Override
	public void salir() {
		System.out.println(pagina.Despedirse());
		pagina.setSalirTienda(true);
	}

}
