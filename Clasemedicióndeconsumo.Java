import java.time.LocalDate;

public class MedicionConsumo {

    private int idMedicion;
    private Servidor servidor;
    private LocalDate fecha;
    private double consumoKwh;
    private double temperatura;
    private double usoCpu;

    public MedicionConsumo(int idMedicion, Servidor servidor, LocalDate fecha,
                           double consumoKwh, double temperatura, double usoCpu) {

        this.idMedicion = idMedicion;
        this.servidor = servidor;
        this.fecha = fecha;
        this.consumoKwh = consumoKwh;
        this.temperatura = temperatura;
        this.usoCpu = usoCpu;
    }

    public int getIdMedicion() {
        return idMedicion;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public double getConsumoKwh() {
        return consumoKwh;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getUsoCpu() {
        return usoCpu;
    }
}