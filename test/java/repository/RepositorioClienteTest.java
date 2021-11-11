package repository;

import domain.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RepositorioClienteTest {

    @Test
    public void buscarClientePorCUIT(){
        Cliente c = new Cliente();
        c.setCUIT(20417369253L);
        c.setNombre("Carlos");
        c.setDomicilio("Moreno 1774");
        c.setCondicionTributaria(CondicionTributaria.ConsumidorFinal);

        RepositorioCliente.inicializar();
        RepositorioCliente.agregarCliente(c);

        assertNull(RepositorioCliente.buscarCliente(27414591417L)); //Cliente inexistente
        assertEquals(RepositorioCliente.buscarCliente(20417369253L), c); //Cliente existente
    }

}