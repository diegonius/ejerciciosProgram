//Ejercicio Programado 9 Semana 1
/*Solicitar al usuario números hasta que se teclee un 0, mostrar la suma de todos
los números introducidos */
import java.util.Scanner;
public class Eje9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saludos! Este sistema te ayudará a sumar todos los numeros que quieras. Empezemos: ");
        int numero;
        int suma = 0;
        System.out.println("Ingresa un numero (0 si quieres terminar):");
        //Proceso para acumular numeros
        while ((numero = scanner.nextInt()) != 0) {
            suma += numero;
        }
        //Mensaje final
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}

