public class ControlAforo {

    private int capacidadMaxima;
    private int asistentesActuales;

    public ControlAforo(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.asistentesActuales = 0;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getAsistentesActuales() {
        return asistentesActuales;
    }

    public boolean registrarIngreso() {

        if (asistentesActuales >= capacidadMaxima) {
            System.out.println("Ingreso rechazado: aforo completo (" + capacidadMaxima + ").");
            return false;
        }

        asistentesActuales++;
        System.out.println("Ingreso aprobado. Asistentes: " + asistentesActuales + "/" + capacidadMaxima);
        return true;
    }

    public boolean registrarSalida() {

        if (asistentesActuales <= 0) {
            System.out.println("Salida rechazada: no hay nadie dentro del evento.");
            return false;
        }

        asistentesActuales--;
        System.out.println("Salida registrada. Asistentes: " + asistentesActuales + "/" + capacidadMaxima);
        return true;
    }
}