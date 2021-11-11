package domain;

public class Producto {
    private int codigo;
    private String descripcion;
    private double costo;
    private double margenGanancia;
    private PorcentajeIVA porcentajeIVA;

    public Producto(){

    }

    public double calcularPrecioDeVenta(){
        double netoGravado = this.costo + this.costo * this.margenGanancia;
        double iva = netoGravado * this.porcentajeIVA.getValor();
        double precioDeVenta = netoGravado + iva;
        return precioDeVenta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

    public PorcentajeIVA getPorcentajeIVA() {
        return porcentajeIVA;
    }

    public void setPorcentajeIVA(PorcentajeIVA porcentajeIVA) {
        this.porcentajeIVA = porcentajeIVA;
    }
}
