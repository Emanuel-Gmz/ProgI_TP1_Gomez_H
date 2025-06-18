package model.servicios;

import model.mascotas.Mascota;
import java.util.logging.Logger;

//**Clase Corte Pelo
public class CortePelo implements Servicio {
  private static final Logger LOGGER = Logger.getLogger(CortePelo.class.getName());
  private Mascota mascota;

  public CortePelo(Mascota mascota) {
    this.mascota = mascota;
  }

  @Override
  public void aplicarServicio() {
    LOGGER.info("Servicio de Corte de pelo para: " + mascota.getNombre());
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
