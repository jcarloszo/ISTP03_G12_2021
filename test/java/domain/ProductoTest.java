package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    public void calcularPrecioDeVenta(){
        PorcentajeIVA porcentajeIVA = new PorcentajeIVA();
        porcentajeIVA.setValor(0.21);

        Producto p = new Producto();
        p.setCosto(100);
        p.setMargenGanancia(0.20);
        p.setPorcentajeIVA(porcentajeIVA);

        double precioDeVentaObtenido = p.calcularPrecioDeVenta();
        double precioDeVentaEsperado = 145.2;

        assertEquals(precioDeVentaEsperado, precioDeVentaObtenido);
    }
}