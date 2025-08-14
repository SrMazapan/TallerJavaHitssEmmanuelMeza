import java.util.Scanner;

public class MenorDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad;
        do {
            System.out.print("Cuantos numeros quieres ingresar? (Deben ser minimo 10): ");
            cantidad = sc.nextInt();
        } while (cantidad < 10);

        int numero;
        int menor = Integer.MAX_VALUE;

        // Bucle para pedir los números
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            numero = sc.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }

        // Mostramos el número menor
        System.out.println("El numero menor es: " + menor);

        // Mensaje adicional según sea el caso
        if (menor < 10) {
            System.out.println("El numero menor es menor que 10");
        } else {
            System.out.println("El numero menor es igual o mayor que 10.");
        }
    }
}
