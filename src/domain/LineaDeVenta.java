package domain;

public class LineaDeVenta {
    private Stock stock;
    private int cantidad;
    private double precioUnitario;

    public LineaDeVenta(Stock stock, int cantidad) {
        this.stock = stock;
        this.cantidad = cantidad;
        this.precioUnitario = stock.getProducto().calcularPrecioDeVenta();
    }

    public double calcularSubTotal(){
        double subTotal = cantidad * precioUnitario;
        return subTotal;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
