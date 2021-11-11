package repository;

import domain.Cliente;

import java.util.ArrayList;

public class RepositorioCliente {
    public static ArrayList<Cliente> clientes;

    public static void inicializar(){
        clientes = new ArrayList<>();
    }

    public static void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public static Cliente buscarCliente(long CUIT){
        for(Cliente c : clientes){
            if(c.getCUIT() == CUIT){
                return  c;
            }
        }
        return null;
    }
}
