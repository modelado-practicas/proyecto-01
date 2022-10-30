public class Oferta{
    private double porcentaje;
    private String departamento;
    public Oferta(double porcentaje, String departamento) {
        this.porcentaje = porcentaje;
        this.departamento = departamento;
    }
    public double getPorcentaje() {
        return porcentaje;
    }
    public String getDepartamento() {
        return departamento;
    }
}
