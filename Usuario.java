
public class Usuario implements Observador{
	private String idUsuario;
	private String password;
	private String nombre;
	private String telefono;
	private String direccion;
	private String cuentaBancaria;
	private Nacionalidad paisOrigen;
	private Oferta oferta = null;
	
	public Usuario(String idUsuario, String password, String nombre, String telefono, String direccion,
			String cuentaBancaria, Pais paisOrigen) {
		super();
		this.idUsuario = idUsuario;
		this.password = password;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.cuentaBancaria = cuentaBancaria;
		setPaisOrigen(paisOrigen);
	}
	public void darOferta(Oferta oferta){
        this.oferta = oferta;
    }

	public String getIdUsuario() {
		return idUsuario;
	}
	public String getPassword() {
		return password;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getCuentaBancaria() {
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
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	
	public void setPaisOrigen(Pais paisOrigen) {
		Nacionalidad nacion = new Nacionalidad();
		nacion.nacionalizar(paisOrigen);
		this.paisOrigen = nacion;
	}
	public Oferta getOferta() {
		return oferta;
	}
	
	
	
	

}
