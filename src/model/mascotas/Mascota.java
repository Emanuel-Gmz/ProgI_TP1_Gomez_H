package model.mascotas;

public abstract class Mascota {
    private final String ID;
    private String nombre;
    private int edad;
    private String raza;
    private String comportamiento;
    private String tamanio;


    public Mascota(String ID,String nombre, int edad, String raza, String comportamiento, String tamanio) {
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.comportamiento = comportamiento;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "ID='" + ID + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", comportamiento='" + comportamiento + '\'' +
                ", tamaño='" + tamanio + '\'' +
                '}';
    }

    public abstract void mostrarFicha();
    abstract String tipoMascota();
}
