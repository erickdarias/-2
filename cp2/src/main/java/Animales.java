public abstract class Animales {
    protected String nombre;
    protected int edad;
    protected String hacerSonidos;

    public Animales(String nombre, int edad, String hacerSonidos) {
        this.nombre = nombre;
        this.edad = edad;
        this.hacerSonidos = hacerSonidos;
    }

    public abstract void mostrarInformacion();
}