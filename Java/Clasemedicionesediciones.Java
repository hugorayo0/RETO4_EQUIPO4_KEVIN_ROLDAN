import java.time.LocalDate;

public class MedicionEmisiones {

    private int idEmision;
    private Servidor servidor;
    private LocalDate fecha;
    private double co2Kg;

    public MedicionEmisiones(int idEmision, Servidor servidor, LocalDate fecha, double co2Kg) {
        this.idEmision = idEmision;
        this.servidor = servidor;
        this.fecha = fecha;
        this.co2Kg = co2Kg;
    }

    public int getIdEmision() {
        return idEmision;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public double getCo2Kg() {
        return co2Kg;
    }
}
