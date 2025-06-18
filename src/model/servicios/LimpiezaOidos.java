package model.servicios;

import model.mascotas.Mascota;

import java.util.logging.Logger;
//**Clase LimpiezaOidos

public class LimpiezaOidos implements Servicio {
  private static final Logger LOGGER = Logger.getLogger(LimpiezaOidos.class.getName());
  private Mascota mascota;

  public LimpiezaOidos(Mascota mascota) {
    this.mascota = mascota;
  }

  @Override
  public void aplicarServicio() {
    LOGGER.info("Servicio de Limpieza de oidos para: " + mascota.getNombre());
  }

  @Override
  public double calcularPrecio() {
    switch (mascota.getTamanio()) {
      case "Pequeño":
        return 8000.0;
      case "Mediano":
        return 15000.0;
      case "Grande":
        return 25000.0;
      default:
        return 0;
    }
  }
}
