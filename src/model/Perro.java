package model;

public class Perro extends Mascota{

    public Perro(String ID, String nombre, int edad, String raza, String comportamiento) {
        super(ID, nombre, edad, raza, comportamiento);
    }

    @Override
    String tipoMascota() {return "";}

    @Override
    public void mostrarFicha() {}
}
