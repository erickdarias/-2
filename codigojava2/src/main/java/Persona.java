public abstract class Persona {
    protected String nombre;
    protected int edad;
    protected String cedula;

    public Persona(String nombre, int edad, String cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public abstract void mostrarInformacion();
}