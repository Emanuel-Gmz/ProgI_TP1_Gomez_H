package model.mascotas;

import java.util.logging.Logger;

public abstract class Mascota {
  private static final Logger LOGGER = Logger.getLogger(Mascota.class.getName());
  private final String iD;
  private String nombre;
  private int edad;
  private String raza;
  private String comportamiento;
  private String tamanio;


  protected Mascota(String iD, String nombre, int edad, String raza, String comportamiento, String tamanio) {
    this.iD = iD;
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
    this.comportamiento = comportamiento;
    this.tamanio = tamanio;
  }

  @Override
  public String toString() {
    return "====== Mascota ======" +
        "\n ID:" + iD +
        "\n Nombre:" + nombre +
        "\n Edad:" + edad +
        "\n Raza:" + raza +
        "\n Comportamiento:" + comportamiento +
        "\n Tamaño:" + tamanio;
  }


  public void mostrarFicha() {
    LOGGER.info(this.toString());
  }

  public abstract String tipoMascota();

  public String getiD() {
    return iD;
  }

  public String getNombre() {
    return nombre;
  }

  public String getTamanio() {
    return tamanio;
  }

}
