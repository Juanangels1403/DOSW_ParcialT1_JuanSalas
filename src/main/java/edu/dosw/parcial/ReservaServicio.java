package edu.dosw.parcial;

import java.util.List;

public abstract class ReservaServicio {
    protected Enlace asignaturas;
    protected Enlace estudiantes;
    protected List<String> reservas;
    protected abstract Reserva crearReserva();
    public String validarReserva(){
        Reserva reserva = crearReserva();
        return reserva.realizarReserva();
    }



}
