package repository;

import domain.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RepositorioStockProductoTest {

    @Test
    public void verStockDisponibleDeProducto(){
        RepositorioStockProducto.inicializar();

        Producto p1 = new Producto();
        p1.setCodigo(10000);
        p1.setDescripcion("Remera deportiva");

        Talle talleS = new Talle("S");
        Talle talleM = new Talle("M");

        Color colorNegro = new Color("Negro");
        Color colorGris = new Color("Gris");
        Color colorBlanco = new Color("Blanco");

        Stock s1 = new Stock();
        s1.setProducto(p1);
        s1.setTalle(talleS);
        s1.setColor(colorBlanco);
        s1.setCantidad(2);
        Stock s2 = new Stock();
        s2.setProducto(p1);
        s2.setTalle(talleS);
        s2.setColor(colorNegro);
        s2.setCantidad(1);
        Stock s3 = new Stock();
        s3.setProducto(p1);
        s3.setTalle(talleM);
        s3.setColor(colorNegro);
        s3.setCantidad(3);
        Stock s4 = new Stock();
        s4.setProducto(p1);
        s4.setTalle(talleM);
        s4.setColor(colorGris);
        s4.setCantidad(0);

        RepositorioStockProducto.agregarStock(s1);
        RepositorioStockProducto.agregarStock(s2);
        RepositorioStockProducto.agregarStock(s3);
        RepositorioStockProducto.agregarStock(s4);

        ArrayList<Stock> resultadoActual = RepositorioStockProducto.getStockDisponible(10000);
        ArrayList<Stock> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add(s1);
        resultadoEsperado.add(s2);
        resultadoEsperado.add(s3);

        assertEquals(resultadoEsperado, resultadoActual);
    }
}