package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VentaTest {

    @Test
    public void agregarLineaDeVentaYActualizarTotal(){
        Venta v = new Venta();

        PorcentajeIVA porcentajeIVA = new PorcentajeIVA();
        porcentajeIVA.setValor(0.21);

        Producto p1 = new Producto();
        p1.setCosto(100);
        p1.setMargenGanancia(0.20);
        p1.setPorcentajeIVA(porcentajeIVA);
        Producto p2 = new Producto();
        p2.setCosto(1000);
        p2.setMargenGanancia(0.20);
        p2.setPorcentajeIVA(porcentajeIVA);

        Stock s1 = new Stock();
        s1.setProducto(p1);
        Stock s2 = new Stock();
        s2.setProducto(p2);

        int cantidad1 = 1;
        int cantidad2 = 2;

        v.agregarLineaDeVenta(s1, cantidad1);
        v.agregarLineaDeVenta(s2, cantidad2);

        double totalActual = v.getTotal();
        double totalEsperado = 3049.2;

        assertEquals(2, v.getLineasDeVenta().size());
        assertEquals(totalEsperado, totalActual);
    }

    @Test
    public void quitarLineaDeVentaYActualizarTotal(){
        Venta v = new Venta();

        PorcentajeIVA porcentajeIVA = new PorcentajeIVA();
        porcentajeIVA.setValor(0.21);

        Producto p1 = new Producto();
        p1.setCodigo(10000);
        p1.setCosto(100);
        p1.setMargenGanancia(0.20);
        p1.setPorcentajeIVA(porcentajeIVA);
        Producto p2 = new Producto();
        p2.setCodigo(10001);
        p2.setCosto(1000);
        p2.setMargenGanancia(0.20);
        p2.setPorcentajeIVA(porcentajeIVA);

        Stock s1 = new Stock();
        s1.setProducto(p1);
        Stock s2 = new Stock();
        s2.setProducto(p2);

        int cantidad1 = 1;
        int cantidad2 = 2;

        v.agregarLineaDeVenta(s1, cantidad1);
        v.agregarLineaDeVenta(s2, cantidad2);

        v.quitarLineaDeVenta(10000);

        double totalActual = v.getTotal();
        double totalEsperado = 2904;

        assertEquals(1, v.getLineasDeVenta().size());
        assertEquals(totalEsperado, totalActual);
    }
}