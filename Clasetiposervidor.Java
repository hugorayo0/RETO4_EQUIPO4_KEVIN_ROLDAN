public class TipoServidor {

    private int idTipo;
    private String descripcion;
    private double consumoBase;

    public TipoServidor(int idTipo, String descripcion, double consumoBase) {
        this.idTipo = idTipo;
        this.descripcion = descripcion;
        this.consumoBase = consumoBase;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getConsumoBase() {
        return consumoBase;
    }

    public void setConsumoBase(double consumoBase) {
        this.consumoBase = consumoBase;
    }
}