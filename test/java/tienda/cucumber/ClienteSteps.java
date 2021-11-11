package tienda.cucumber;

import domain.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ClienteSteps {
    private Cliente cliente;
    private long CUIT;
    private String mensaje;

    @Given("Dado un cliente con CUIT {long}")
    public void dadoUnClienteConCUIT(long arg0) {
        cliente = new Cliente();
        cliente.setCUIT(arg0);
    }

    @When("ingreso un CUIT {long}")
    public void ingresoUnCUIT(long arg0) {
        if(cliente.getCUIT() != CUIT){
            mensaje = "Cliente inexistente";
        }
    }

    @Then("Veo un mensaje {string}")
    public void veoUnMensaje(String arg0) {
        assertEquals(arg0, mensaje);
    }
}
