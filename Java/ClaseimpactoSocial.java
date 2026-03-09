public class ClaseimpactoSocial {

    private int idImpacto;
    private int idCentro;
    private String fecha;
    private int empleosGenerados;
    private double indiceSatisfaccion;

    // Constructor vacío
    public ClaseimpactoSocial() {
    }

    // Constructor con parámetros
    public ClaseimpactoSocial(int idImpacto, int idCentro, String fecha, int empleosGenerados, double indiceSatisfaccion) {
        this.idImpacto = idImpacto;
        this.idCentro = idCentro;
        this.fecha = fecha;
        this.empleosGenerados = empleosGenerados;
        this.indiceSatisfaccion = indiceSatisfaccion;
    }

    // Getters y Setters

    public int getIdImpacto() {
        return idImpacto;
    }

    public void setIdImpacto(int idImpacto) {
        this.idImpacto = idImpacto;
    }

    public int getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(int idCentro) {
        this.idCentro = idCentro;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEmpleosGenerados() {
        return empleosGenerados;
    }

    public void setEmpleosGenerados(int empleosGenerados) {
        this.empleosGenerados = empleosGenerados;
    }

    public double getIndiceSatisfaccion() {
        return indiceSatisfaccion;
    }

    public void setIndiceSatisfaccion(double indiceSatisfaccion) {
        this.indiceSatisfaccion = indiceSatisfaccion;
    }
}
