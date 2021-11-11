package domain;

public class Cliente {
    private long CUIT;
    private CondicionTributaria condicionTributaria;
    private String nombre;
    private String domicilio;

    public Cliente(){}

    public void setCUIT(long CUIT) {
        this.CUIT = CUIT;
    }

    public long getCUIT() {
        return CUIT;
    }

    public CondicionTributaria getCondicionTributaria() {
        return condicionTributaria;
    }

    public void setCondicionTributaria(CondicionTributaria condicionTributaria) {
        this.condicionTributaria = condicionTributaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
