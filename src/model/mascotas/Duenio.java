package model.mascotas;

import java.util.logging.Logger;

public class Duenio {
  private static final Logger LOGGER = Logger.getLogger(Duenio.class.getName());
  private String nombre;
  private String telefono;
  Mascota[] mascotas = new Mascota[4];
  private int contadorMascotas = 0;

  public Duenio(String nombre, String telefono) {
    this.nombre = nombre;
    this.telefono = telefono;
  }

  public String getNombre() {
    return nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public void agregarMascota(Mascota mascota) {
    if (contadorMascotas < 4) {
      mascotas[contadorMascotas++] = mascota;
    } else {
      LOGGER.info("No se pueden registrar más mascotas a este dueño");
    }
  }

  public void mostrarMascota() {
    for (int i = 0; i < contadorMascotas; i++) {
      mascotas[i].mostrarFicha();
    }
  }
}
