//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    ControlAforo aforo = new ControlAforo(5);

    System.out.println("--- Ingresos masivos (capacidad: " + aforo.getCapacidadMaxima() + ") ---");
    int admitidos = 0;
    int rechazados = 0;

    for (int i = 1; i <= 8; i++) {
        if (aforo.registrarIngreso()) {
            admitidos++;
        } else {
            rechazados++;
        }
    }

    System.out.println("\nAdmitidos: " + admitidos + " | Rechazados: " + rechazados);

    System.out.println("\n--- Salidas ---");
    aforo.registrarSalida();
    aforo.registrarSalida();

    System.out.println("\n--- Ingreso tras liberar lugar ---");
    aforo.registrarIngreso();

    System.out.println("\n--- Vaciando el evento y salida de más ---");
    for (int i = 0; i < 5; i++) {
        aforo.registrarSalida();
    }
    aforo.registrarSalida();   // ya no hay nadie

    System.out.println("\nAsistentes finales: " + aforo.getAsistentesActuales());

}
