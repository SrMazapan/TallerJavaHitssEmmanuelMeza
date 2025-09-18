import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Representa un vuelo con su información detallada.
 */
public class Vuelo {
    // Atributos de la clase Vuelo
    private String nombre;
    private String origen;
    private String destino;
    private LocalDateTime fechaLlegada;
    private int numPasajeros;

    /**
     * Constructor para inicializar un objeto Vuelo.
     */
    public Vuelo(String nombre, String origen, String destino, LocalDateTime fechaLlegada, int numPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.numPasajeros = numPasajeros;
    }

    // Métodos "getters" para acceder a los atributos desde fuera de la clase
    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    @Override
    public String toString() {
        // Damos un formato legible a la fecha y hora para mostrarla
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd MMM yyyy HH:mm 'hrs'");
        return "Vuelo " + nombre + " | Origen: " + origen + 
               " | Llegada: " + fechaLlegada.format(formatter) + 
               " | Pasajeros: " + numPasajeros;
    }
}
