package model;

public class Gato extends Mascota{

    public Gato(String ID, String nombre, int edad, String raza, String comportamiento) {
        super(ID, nombre, edad, raza, comportamiento);
    }

    @Override
    public void mostrarFicha() {}

    @Override
    String tipoMascota() {return "";}
}
