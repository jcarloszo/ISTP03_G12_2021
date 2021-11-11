package repository;

import domain.*;

import java.util.ArrayList;

public class RepositorioStockProducto {
    public static ArrayList<Stock> stocks;

    public static void inicializar(){
        stocks = new ArrayList<>();
    }

    public static void agregarStock(Stock s){
        stocks.add(s);
    }

    public static ArrayList<Stock> getStockDisponible(int codigoProducto){
        ArrayList<Stock> stockDisponible = new ArrayList<>();
        for(Stock s : stocks){
            if(s.getProducto().getCodigo() == codigoProducto && s.getCantidad() > 0){
                stockDisponible.add(s);
            }
        }
        return  stockDisponible;
    }
}
