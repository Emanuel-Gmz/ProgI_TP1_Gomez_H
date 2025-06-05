package model;

public abstract class Mascota {
    private String nombre;
    private int edad;
    private String raza;
    private String comportamiento;
    private final String ID;

    public Mascota(String ID,String nombre, int edad, String raza, String comportamiento) {
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.comportamiento = comportamiento;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", comportamiento='" + comportamiento + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
    public abstract void mostrarFicha();
    abstract String tipoMascota();
}
