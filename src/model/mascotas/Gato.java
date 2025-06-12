package model.mascotas;

public class Gato extends Mascota {

  public Gato(String iD, String nombre, int edad, String raza, String comportamiento, String tamanio) {
    super(iD, nombre, edad, raza, comportamiento, tamanio);
  }

  @Override
  public String tipoMascota() {
    return "Gato";
  }
}
