import java.util.Scanner;

public class SistemaDeVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double totalVentas = 0.0;

        do {
            System.out.println("Menu de ventas");
            System.out.println("1. Registrar un pedido");
            System.out.println("2. Mostrar el total de ventas");
            System.out.println("3. Salir del sistema");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingresa el precio del pedido: ");
                double precio = scanner.nextDouble();

                if (precio > 0) {
                    totalVentas += precio;
                    System.out.println("Pedido registrado exitosamente.");
                } else {
                    System.out.println("Error: El precio debe ser positivo.");
                }
            } else if (opcion == 2) {
                System.out.println("Total de ventas: $" + totalVentas);
            } else if (opcion == 3) {
                System.out.println("Saliendo del sistema...");
            } else {
                System.out.println("Opción inválida. Intenta de nuevo.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}
