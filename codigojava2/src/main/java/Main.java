public class Main {
    public static void main(String[] args) {
        Pasajero pasajero = new Pasajero("Erick", 21, "1751485028");
        pasajero.pedirTaxi();
        pasajero.mostrarInformacion();

        System.out.println("-------------");

        Chofer chofer = new Chofer("Rodrygo", 30, "987654321", "ABC123", "TAXI001");
        chofer.aceptarCarrera();
        chofer.mostrarInformacion();
    }
}