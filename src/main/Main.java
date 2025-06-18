package main;

import model.mascotas.Duenio;
import model.mascotas.Gato;
import model.mascotas.Mascota;
import model.mascotas.Perro;
import model.servicios.*;

import java.time.LocalDate;
import java.util.logging.Logger;

import model.turnos.Turno;

//**Clase Main

public class Main {
  public static final Logger LOGGER = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {

    final Duenio duenio1 = new Duenio("Emanuel", "123456789");
    final Duenio duenio2 = new Duenio("Hector", "112233445");


    Mascota perro1 = new Perro("010", "Logan", 7, "Caniche", "Calmado", "Mediano");
    Mascota gato1 = new Gato("001", "Bobby", 4, "Siames", "Tranquilo", "Pequeño");
    Mascota perro2 = new Perro("017", "Aaron", 3, "Caniche", "Asustadizo", "Grande");


    LOGGER.info("ID de:  " + perro1.getNombre() + ": " + perro1.getiD());
    LOGGER.info("ID  de: " + gato1.getNombre() + ": " + gato1.getiD());
    LOGGER.info("ID de: " + perro2.getNombre() + ": " + perro2.getiD());


    duenio1.agregarMascota(perro1);
    duenio2.agregarMascota(gato1);
    duenio1.agregarMascota(perro2);

    Servicio banio = new Banio(perro1);
    Servicio cortePelo = new CortePelo(perro2);
    Servicio limpiezaoidos = new LimpiezaOidos(gato1);


    Servicio baniocom = new Banio(perro2);
    Servicio cortecom = new CortePelo(perro2);
    Servicio limpiecom = new LimpiezaOidos(perro2);

    Servicio combocomple = new ComboCompleto(baniocom,  cortecom,  limpiecom);


    LOGGER.info("Mascotas de Emanuel:");
    duenio1.mostrarMascota();
    LOGGER.info("Mascotas de Hector:");
    duenio2.mostrarMascota();


    Turno turno1 = new Turno(perro2, cortePelo, LocalDate.now());
    turno1.confirmarTurno();
    turno1.mostrarDetalle();

    Turno turno2 = new Turno(perro1, banio, LocalDate.now());
    turno2.confirmarTurno();
    turno2.mostrarDetalle();

    Turno turno3 = new Turno(perro2, combocomple, LocalDate.now());
    turno3.confirmarTurno();
    turno3.mostrarDetalle();

    Turno turno4 = new Turno(gato1, limpiezaoidos, LocalDate.now());
    turno4.confirmarTurno();
    turno4.mostrarDetalle();
  }
}