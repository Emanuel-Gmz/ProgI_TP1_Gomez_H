package model.turnos;

import model.mascotas.Duenio;
import model.mascotas.Mascota;
import model.servicios.Servicio;

import java.time.LocalDate;

public class Turno {
    Mascota mascota;
    Duenio duenio;
    Servicio servicio;
    LocalDate fecha;


    void confirmarTurno(){}
    void mostrarDetalle(){}
}
