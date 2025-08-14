import java.util.Scanner;

public class MultiplicacionSinAsterisco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

        int resultado = 0;

        // Convertimos ambos números a positivos temporalmente
        int a = Math.abs(num1);
        int b = Math.abs(num2);

        // Sumamos 'a' un total de 'b' veces
        for (int i = 0; i < b; i++) {
            resultado += a;
        }

        // Determinamos el signo del resultado
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            resultado = -resultado;
        }

        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
