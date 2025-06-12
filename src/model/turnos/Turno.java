package model.turnos;

import model.mascotas.Mascota;
import java.time.LocalDate;
import java.util.logging.Logger;
import model.servicios.Servicio;

public class Turno {
  private static final Logger LOGGER = Logger.getLogger(Turno.class.getName());
  private Mascota mascota;
  private Servicio servicio;
  private LocalDate fecha;

  public Turno(Mascota mascota, Servicio servicio, LocalDate fecha) {
    this.mascota = mascota;
    this.servicio = servicio;
    this.fecha = fecha;
  }


  public void confirmarTurno() {
    LOGGER.info("Turno confirmado para " + mascota.getNombre() + " el " + fecha);
    servicio.aplicarServicio();
  }

  public void mostrarDetalle() {
    LOGGER.info("=======  Detalle del turno:  =========" +
        "\n Mascota:" + mascota.getNombre() +
        "\n Fecha:" + fecha +
        "\n Servicio:" + servicio.getClass().getSimpleName() +
        "\n Costo Total:" + servicio.calcularPrecio());
  }
}
