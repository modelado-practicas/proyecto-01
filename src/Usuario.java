
public class Usuario implements Observador{
	private String idUsuario;
	private String Password;
	private String Nombre;
	private long Telefono;
	private String Direccion;
	private long CuentaBancaria;
	private Nacionalidad PaisOrigen;
	private double descuento = 0;

	/** 
     * Actualiza % descuento segun el pais
	 * por defecto es 0
	 * El filtro se hara en el Sujeto que notifica
     * @param descuento la descuento.
     */
    public void actualizar(double descuento){
        this.descuento = descuento;
    }

	public String getIdUsuario() {
		return idUsuario;
	}

	public String getPassword() {
		return Password;
	}

	public String getNombre() {
		return Nombre;
	}

	public long getTelefono() {
		return Telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public long getCuentaBancaria() {
		return CuentaBancaria;
	}

	public Nacionalidad getPaisOrigen() {
		return PaisOrigen;
	}

	public double getDescuento() {
		return descuento;
	}

}
