public class Chofer extends Persona {
    private String placa;
    private String codigoTaxi;
    private boolean aceptarCarrera;
    private boolean cancelarCarrera;

    public Chofer(String nombre, int edad, String cedula, String placa, String codigoTaxi) {
        super(nombre, edad, cedula);
        this.placa = placa;
        this.codigoTaxi = codigoTaxi;
        this.aceptarCarrera = false;
        this.cancelarCarrera = false;
    }

    public void aceptarCarrera() {
        this.aceptarCarrera = true;
    }

    public void cancelarCarrera() {
        this.cancelarCarrera = true;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Chofer: " + nombre + ", Edad: " + edad + ", Cédula: " + cedula);
        System.out.println("Placa: " + placa + ", Código Taxi: " + codigoTaxi);
        System.out.println("Aceptar Carrera: " + (aceptarCarrera ? "Sí" : "No") + ", Cancelar Carrera: " + (cancelarCarrera ? "Sí" : "No"));
    }
}
