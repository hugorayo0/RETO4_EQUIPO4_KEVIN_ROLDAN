public class Servidor {

    private int idServidor;
    private CentroDatos centro;
    private TipoServidor tipo;
    private String nombre;
    private String estado;

    public Servidor(int idServidor, CentroDatos centro, TipoServidor tipo, String nombre, String estado) {
        this.idServidor = idServidor;
        this.centro = centro;
        this.tipo = tipo;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdServidor() {
        return idServidor;
    }

    public void setIdServidor(int idServidor) {
        this.idServidor = idServidor;
    }

    public CentroDatos getCentro() {
        return centro;
    }

    public void setCentro(CentroDatos centro) {
        this.centro = centro;
    }

    public TipoServidor getTipo() {
        return tipo;
    }

    public void setTipo(TipoServidor tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarInfo() {
        System.out.println("Servidor: " + nombre +
                " Centro: " + centro.getNombre() +
                " Tipo: " + tipo.getDescripcion() +
                " Estado: " + estado);
    }
}
