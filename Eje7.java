//Ejercicio Programado 7 Semana 1: 
/*Solicitar un número al usuario y mostrar su cuadrado, repetir el proceso hasta
que se introduzca un número negativo */
import java.util.Scanner;
public class Eje7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BIENVENIDO al sistema automatico de cálculo al cuadrado...");
        int numero = 0;
        while (numero >= 0) {
            // Solicitar al usuario un número
            System.out.println("Ingrese un número entero positivo (Si quiere salir, ingresa uno negativo): ");
            numero = scanner.nextInt();
            // Verificar si el número es negativo
            if (numero < 0) {
                System.out.println("Fin del programa.");
            } else {
                // Calcular y mostrar el cuadrado del número
                int cuadrado = numero * numero;
                System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
            }
        }
        System.out.println("Hasta luego, que te vaya bien!");
    }
}
