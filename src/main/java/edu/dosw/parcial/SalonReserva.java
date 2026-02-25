package edu.dosw.parcial;

public class SalonReserva implements Reserva{
    private final String TIEMPO = "180 minutos";
    private String tipoUsuario;
    private String materia;
    private   int puestos = 30;
    private String nombreSalon;
    private String computador;
    private String proyector;
    private String fecha;
    private String hora;

    public SalonReserva(String nombreSalon, String materia, int puestos){
        this.nombreSalon = nombreSalon;
        this.materia = materia;
        if (puestos < 1 ) throw new IllegalArgumentException("Capacidad no valida");
    }
    @Override
    public String realizarReserva() {
        return "Se realizo la reserva correctamente en el Salon";
    }
    public void registroHoraFecha(String fecha, String hora){
        this.fecha = fecha;
        this.hora = hora ;
    }

    public void registroComputador(String validacion){this.computador = validacion;}
    public void registroProyector(String validacion){this.proyector = validacion;}

    public String getTIEMPO(){return TIEMPO;}
    public String getMateria(){return materia; }
}
