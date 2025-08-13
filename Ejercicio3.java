import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadNotas = 20, contadorMayoresIgual6 = 0, contadorMenores6 = 0, cantidadIgualesA1 = 0;
        double sumaMayoresIgual6 = 0, sumaMenores6 = 0, sumaTotal = 0;
        

        for (int i = 1; i <= cantidadNotas; i++) {
            System.out.print("Ingresa la nota " + i + " (entre 1.0 y 10.0): ");
            double nota = sc.nextDouble();

            if (nota < 1.0 || nota > 10.0) {
                System.out.println("Error. El numero ingresado esta fuera del rango. Programa finalizado.");
                return;
            }

            sumaTotal += nota;

            if (nota >= 6.0) {
                sumaMayoresIgual6 += nota;
                contadorMayoresIgual6++;
            } else {
                sumaMenores6 += nota;
                contadorMenores6++;
            }

            if (nota == 1.0) {
                cantidadIgualesA1++;
            }
        }

        double promedioMayoresIgual6;
        if (contadorMayoresIgual6 > 0) {
            promedioMayoresIgual6 = sumaMayoresIgual6 / contadorMayoresIgual6;
        } else {
            promedioMayoresIgual6 = 0;
        }

        double promedioMenores6;
        if (contadorMenores6 > 0) {
            promedioMenores6 = sumaMenores6 / contadorMenores6;
        } else {
            promedioMenores6 = 0;
        }

        double promedioTotal;
        if (cantidadNotas > 0) {
            promedioTotal = sumaTotal / cantidadNotas;
        } else {
            promedioTotal = 0;
        }

        System.out.printf("Promedio de notas >= 6.0: %.2f\n", promedioMayoresIgual6);
        System.out.printf("Promedio de notas < 6.0: %.2f\n", promedioMenores6);
        System.out.println("Cantidad de notas iguales a 1.0: " + cantidadIgualesA1);
        System.out.printf("Promedio total: %.2f\n", promedioTotal);
    }
}
