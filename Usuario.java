
public class Usuario {
	private String idUsuario;
	private String password;
	private String nombre;
	private long telefono;
	private String direccion;
	private long cuentaBancaria;
	private Nacionalidad paisOrigen;
	
	public String getIdUsuario() {
		return idUsuario;
	}
	public String getPassword() {
		return password;
	}
	public String getNombre() {
		return nombre;
	}
	public long getTelefono() {
		return telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public long getCuentaBancaria() {
		return cuentaBancaria;
	}
	public Nacionalidad getPaisOrigen() {
		return paisOrigen;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setCuentaBancaria(long cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	
	public void setPaisOrigen(Pais paisOrigen) {
		this.paisOrigen.nacionalizar(paisOrigen);
	}
	
	
	
	

}
