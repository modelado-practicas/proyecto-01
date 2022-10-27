
public class PaginaPais {
	private Usuario user;
	private boolean carritoOcupado;
	private boolean compraPagada;
	private boolean salirTienda;
	private boolean comprar;
	
	public PaginaPais(String idUsuario, long contraseña) {
		
		/*
		 * hacer la parte de verificar al cliente aqui
		 * if (se encuentra el usuario en la lista){
		 *  	user = usuario coincidente
		 * 
		 */
		carritoOcupado = false;
		compraPagada = false;
		salirTienda = false;
		comprar = false;
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
	public void catalogo() {
		
	}
	
	public String opcionesComprar() {
		return user.getPaisOrigen().realizarCompra();
	}
	

}
