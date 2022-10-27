public class Producto{
    private String codigo;
    private String nombre;
    private String departamento;
    private double precio;
    
    public Producto(String codigo, String nombre, String departamento, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.departamento = departamento;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getPrecio() {
        return precio;
    }
}