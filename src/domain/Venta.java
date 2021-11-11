package domain;

import java.util.ArrayList;

public class Venta {
    private ArrayList<LineaDeVenta> lineasDeVenta;
    private double total;

    public Venta(){
        lineasDeVenta = new ArrayList<>();
        total = 0;
    }

    public void agregarLineaDeVenta(Stock stock, int cantidad){
        LineaDeVenta ldv = new LineaDeVenta(stock, cantidad);
        lineasDeVenta.add(ldv);
        total = total + ldv.calcularSubTotal();
    }

    public void quitarLineaDeVenta(int codigoProducto){
        LineaDeVenta ldv = null;
        for(LineaDeVenta l : lineasDeVenta){
            if(l.getStock().getProducto().getCodigo() == codigoProducto){
                ldv = l;
                break;
            }
        }
        total = total - ldv.calcularSubTotal();
        lineasDeVenta.remove(ldv);
    }

    public double getTotal() {
        return total;
    }

    public ArrayList<LineaDeVenta> getLineasDeVenta() {
        return lineasDeVenta;
    }
}
