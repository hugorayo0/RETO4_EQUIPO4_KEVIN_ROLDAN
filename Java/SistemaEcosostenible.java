import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEcosostenible {

    public static void main(String[] args) {
        CentroDatos centro1 = new CentroDatos(1, "Centro Norte", "Ciudad A");
        CentroDatos centro2 = new CentroDatos(2, "Centro Sur", "Ciudad B");

        TipoServidor tipo1 = new TipoServidor(1, "Servidor Básico", 1.5);
        TipoServidor tipo2 = new TipoServidor(2, "Servidor Avanzado", 3.0);

        Servidor s1 = new Servidor(1, centro1, tipo1, "Servidor-1", "Activo");
        Servidor s2 = new Servidor(2, centro2, tipo2, "Servidor-2", "Activo");

        ArrayList<Servidor> listaServidores = new ArrayList<>();
        listaServidores.add(s1);
        listaServidores.add(s2);

        ArrayList<MedicionConsumo> listaConsumo = new ArrayList<>();
        ArrayList<MedicionEmisiones> listaEmisiones = new ArrayList<>();

        listaConsumo.add(new MedicionConsumo(1, s1, LocalDate.now(), 120.5, 30.2, 75));
        listaConsumo.add(new MedicionConsumo(2, s2, LocalDate.now(), 220.0, 40.1, 80));

        listaEmisiones.add(new MedicionEmisiones(1, s1, LocalDate.now(), 50.5));
        listaEmisiones.add(new MedicionEmisiones(2, s2, LocalDate.now(), 80.0));

        ArrayList<ClaseImpactoSocial> listaImpacto = new ArrayList<>();
        listaImpacto.add(new ClaseImpactoSocial(1, centro1.getIdCentro(), LocalDate.now(), 5, 4.8));
        listaImpacto.add(new ClaseImpactoSocial(2, centro2.getIdCentro(), LocalDate.now(), 3, 4.5));

        System.out.println("----- Servidores -----");
        for(Servidor s : listaServidores) {
            System.out.println(s);
        }

        System.out.println("\n----- Mediciones de Consumo -----");
        for(MedicionConsumo mc : listaConsumo) {
            System.out.println(mc.getServidor().getNombre() + " | " + mc.getConsumoKwh() + " kWh | " + mc.getTemperatura() + "°C | CPU: " + mc.getUsoCpu() + "%");
        }

        System.out.println("\n----- Mediciones de Emisiones -----");
        for(MedicionEmisiones me : listaEmisiones) {
            System.out.println(me.getServidor().getNombre() + " | CO2: " + me.getCo2Kg() + " kg");
        }

        System.out.println("\n----- Impacto Social -----");
        for(ClaseImpactoSocial ci : listaImpacto) {
            System.out.println("Centro ID: " + ci.getIdCentro() + " | Empleos: " + ci.getEmpleosGenerados()) ;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese ID de servidor para ver mediciones:");
        int id = sc.nextInt();
        for(MedicionConsumo mc : listaConsumo) {
            if(mc.getServidor().getIdServidor() == id){
                System.out.println("Consumo: " + mc.getConsumoKwh() + " kWh, Temperatura: " + mc.getTemperatura() + "°C, CPU: " + mc.getUsoCpu() + "%");
            }
        }
        for(MedicionEmisiones me : listaEmisiones) {
            if(me.getServidor().getIdServidor() == id){
                System.out.println("CO2: " + me.getCo2Kg() + " kg");
            }
        }
        sc.close();
    }

    static class CentroDatos {
        private int idCentro;
        private String nombre;
        private String ubicacion;
        public CentroDatos(int idCentro, String nombre, String ubicacion) {
            this.idCentro = idCentro;
            this.nombre = nombre;
            this.ubicacion = ubicacion;
        }
        public int getIdCentro() { return idCentro; }
        public String getNombre() { return nombre; }
        public String getUbicacion() { return ubicacion; }
        @Override
        public String toString() { return nombre + " - " + ubicacion; }
    }

    static class TipoServidor {
        private int idTipo;
        private String descripcion;
        private double consumoBase;
        public TipoServidor(int idTipo, String descripcion, double consumoBase) {
            this.idTipo = idTipo;
            this.descripcion = descripcion;
            this.consumoBase = consumoBase;
        }
        public int getIdTipo() { return idTipo; }
        public String getDescripcion() { return descripcion; }
        public double getConsumoBase() { return consumoBase; }
    }

    static class Servidor {
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
        public int getIdServidor() { return idServidor; }
        public CentroDatos getCentro() { return centro; }
        public TipoServidor getTipo() { return tipo; }
        public String getNombre() { return nombre; }
        public String getEstado() { return estado; }
        @Override
        public String toString() { return nombre + " | " + centro.getNombre() + " | " + tipo.getDescripcion() + " | " + estado; }
    }

    static class MedicionConsumo {
        private int idMedicion;
        private Servidor servidor;
        private LocalDate fecha;
        private double consumoKwh;
        private double temperatura;
        private double usoCpu;
        public MedicionConsumo(int idMedicion, Servidor servidor, LocalDate fecha, double consumoKwh, double temperatura, double usoCpu) {
            this.idMedicion = idMedicion;
            this.servidor = servidor;
            this.fecha = fecha;
            this.consumoKwh = consumoKwh;
            this.temperatura = temperatura;
            this.usoCpu = usoCpu;
        }
        public int getIdMedicion() { return idMedicion; }
        public Servidor getServidor() { return servidor; }
        public double getConsumoKwh() { return consumoKwh; }
        public double getTemperatura() { return temperatura; }
        public double getUsoCpu() { return usoCpu; }
    }

    static class MedicionEmisiones {
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
        public int getIdEmision() { return idEmision; }
        public Servidor getServidor() { return servidor; }
        public double getCo2Kg() { return co2Kg; }
    }

    static class ClaseImpactoSocial {
        private int idImpacto;
        private int idCentro;
        private LocalDate fecha;
        private int empleosGenerados;
        private double indiceSatisfaccion;
        public ClaseImpactoSocial(int idImpacto, int idCentro, LocalDate fecha, int empleosGenerados, double indiceSatisfaccion) {
            this.idImpacto = idImpacto;
            this.idCentro = idCentro;
            this.fecha = fecha;
            this.empleosGenerados = empleosGenerados;
            this.indiceSatisfaccion = indiceSatisfaccion;
        }
        public int getIdImpacto() { return idImpacto; }
        public int getIdCentro() { return idCentro; }
        public LocalDate getFecha() { return fecha; }
        public int getEmpleosGenerados() { return empleosGenerados; }
        public double getIndiceSatisfaccion() { return indiceSatisfaccion; }
    }
}
