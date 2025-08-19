import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};

        int numeroMasRepetido = 0;
        int maxOcurrencias = 0;

        for (int i = 0; i < arreglo.length; i++) {
            int contador = 0;

            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    contador++;
                }
            }
            if (contador > maxOcurrencias) {
                maxOcurrencias = contador;
                numeroMasRepetido = arreglo[i];
            }
        }
        System.out.println("1. La mayor ocurrencias es: " + maxOcurrencias);
        System.out.println("2. El elemento que más se repite es: " + numeroMasRepetido);
    }
}
