//Ejercicio Programado 8 Semana 1
/*Solicitar un número e indicar si es positivo o negativo. El proceso se repetirá
hasta que se introduzca un 0 */
import java.util.Scanner;
public class Eje8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 3;
        System.out.println("Saludos! Este sistema te ayudará a ver si un numero es positivo o negativo ");
        while (num != 0) {
            // Solicitar al usuario un numero
            System.out.println("Ingrese un numero (ingrese 0 para salir): ");
            num = scanner.nextInt();
            // Verificar si el numero es positivo, negativo o cero
            if (num > 0) {
                System.out.println("El numero es positivo.");
            } else if (num < 0) {
                System.out.println("El numero es negativo.");
            } else {
                System.out.println("Listo, terminamos");
            }
        }System.out.println("Hasta luego!");
    }
}

