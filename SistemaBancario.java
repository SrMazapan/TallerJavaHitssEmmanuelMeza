import java.util.ArrayList;
import java.util.Scanner;

class Cuenta {
    private static int contadorCuentas = 1; // para IDs automáticos
    private int id;
    private String titular;
    private double saldo;

    public Cuenta(String titular, double depositoInicial) {
        this.id = contadorCuentas++;
        this.titular = titular;
        this.saldo = depositoInicial;
    }

    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        } else {
            return false; // no hay dinero suficiente
        }
    }

    public String toString() {
        return "Cuenta ID: " + id + " | Titular: " + titular + " | Saldo: $" + saldo;
    }
}

class Transaccion {
    private static int contadorTransacciones = 1;
    private int id;
    private String tipo;
    private double monto;
    private int cuentaId;

    public Transaccion(String tipo, double monto, int cuentaId) {
        this.id = contadorTransacciones++;
        this.tipo = tipo;
        this.monto = monto;
        this.cuentaId = cuentaId;
    }

    public String toString() {
        return "Transaccion ID: " + id + " | Tipo: " + tipo + " | Monto: $" + monto + " | Cuenta ID: " + cuentaId;
    }
}

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        ArrayList<Transaccion> transacciones = new ArrayList<>();

        // Crear cuentas (ejemplo)
        Cuenta ana = new Cuenta("Ana", 5000);
        Cuenta luis = new Cuenta("Luis", 10000);
        cuentas.add(ana);
        cuentas.add(luis);

        ana.depositar(2000);
        transacciones.add(new Transaccion("Depósito", 2000, ana.getId()));

        ana.retirar(1000);
        transacciones.add(new Transaccion("Retiro", 1000, ana.getId()));

        luis.retirar(3000);
        transacciones.add(new Transaccion("Retiro", 3000, luis.getId()));

        luis.depositar(1500);
        transacciones.add(new Transaccion("Depósito", 1500, luis.getId()));

        System.out.println("=== Información de Cuentas ===");
        for (Cuenta c : cuentas) {
            System.out.println(c);
        }

        System.out.println("\n=== Historial de Transacciones ===");
        for (Transaccion t : transacciones) {
            System.out.println(t);
        }

        sc.close();
    }
}
