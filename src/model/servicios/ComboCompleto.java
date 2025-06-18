package model.servicios;

import model.mascotas.Mascota;

import java.util.logging.Logger;

//**Clase ComboCompleto
public class ComboCompleto implements Servicio {
  private static final Logger LOGGER = Logger.getLogger(ComboCompleto.class.getName());
  private Servicio[] servicios;
  private Mascota mascota;

  public ComboCompleto(Servicio banio, Servicio cortePelo, Servicio limpiezaoidos) {
    this.servicios = new Servicio[]{banio, cortePelo, limpiezaoidos};
  }

  @Override
  public void aplicarServicio() {
    LOGGER.info("Aplicando combo completo");
    for (Servicio servicio : servicios) {
      servicio.aplicarServicio();
    }
  }

  @Override
  public double calcularPrecio() {
    double total = 0;
    for (Servicio servicio : servicios) {
      total += servicio.calcularPrecio();
    }return total;
  }
}
