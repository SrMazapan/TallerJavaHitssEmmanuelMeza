// Clase base: Persona
class Herencia {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}

// Clase Empleado que hereda de Persona
class Empleado extends Persona {
    private double sueldo;

    // Constructor
    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad); // Llama al constructor de Persona
        this.sueldo = sueldo;
    }

    // Getter
    public double getSueldo() {
        return sueldo;
    }

    // Método para aumentar sueldo
    public void aumentarSueldo(double porcentaje) {
        sueldo += sueldo * porcentaje / 100;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sueldo: $" + sueldo;
    }
}

// Clase Cliente que hereda de Persona
class Cliente extends Persona {
    private String codigoCliente;

    // Constructor
    public Cliente(String nombre, int edad, String codigoCliente) {
        super(nombre, edad);
        this.codigoCliente = codigoCliente;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Código Cliente: " + codigoCliente;
    }
}

// Clase Gerente que hereda de Empleado
class Gerente extends Empleado {
    private double presupuesto;

    // Constructor
    public Gerente(String nombre, int edad, double sueldo, double presupuesto) {
        super(nombre, edad, sueldo);
        this.presupuesto = presupuesto;
    }

    // Getter y Setter
    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + ", Presupuesto: $" + presupuesto;
    }
}

// Clase principal con main
public class Main {
    public static void main(String[] args) {
        // Crear un gerente
        Gerente g1 = new Gerente("Carlos López", 40, 25000, 100000);

        // Imprimir datos del gerente
        System.out.println("Datos del gerente:");
        System.out.println(g1);

        // Aumentar sueldo
        g1.aumentarSueldo(10); // aumenta 10%
        System.out.println("\nDespués del aumento de sueldo:");
        System.out.println(g1);

        // Cambiar presupuesto
        g1.setPresupuesto(150000);
        System.out.println("\nDespués de modificar el presupuesto:");
        System.out.println(g1);
    }
}
