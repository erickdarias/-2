
public class Pasajero extends Persona {
    private boolean pedirTaxi;
    private boolean cancelarTaxi;

    public Pasajero(String nombre, int edad, String cedula) {
        super(nombre, edad, cedula);
        this.pedirTaxi = false;
        this.cancelarTaxi = false;
    }

    public void pedirTaxi() {
        this.pedirTaxi = true;
    }

    public void cancelarTaxi() {
        this.cancelarTaxi = true;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Pasajero: " + nombre + ", Edad: " + edad + ", Cédula: " + cedula);
        System.out.println("Estado Taxi: " + (pedirTaxi ? "Pedido" : "No pedido") + ", Cancelar Taxi: " + (cancelarTaxi ? "Sí" : "No"));
    }
}
