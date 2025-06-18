package model.mascotas;

//**Clase PerroHeredada
public class Perro extends Mascota {

  public Perro(String iD, String nombre, int edad, String raza, String comportamiento, String tamanio) {
    super(iD, nombre, edad, raza, comportamiento, tamanio);
  }

  @Override
  public String tipoMascota() {
    return "Perro";
  }
}
