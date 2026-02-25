package edu.dosw.parcial;

public class OficinaReserva implements Reserva{
    private String nombreOficina;
    private int puestos;
    private final int TIEMPOMAX = 240;  //min
    private String hora;
    private String fecha;
    private int tiempoRequerido;


    public OficinaReserva(String nombreOficina, int puestos, String hora, String fecha, int tiempoRequerido){
        this.nombreOficina = nombreOficina;
        this.puestos = puestos;
        this.hora = hora;
        this.fecha = fecha;
        if (tiempoRequerido > TIEMPOMAX)throw new IllegalArgumentException("Lo siento el tiempo sobrepasa el limite");
    }


    @Override
    public String realizarReserva() {
        return "Reserva exitosa en la oficina";
    }


}
