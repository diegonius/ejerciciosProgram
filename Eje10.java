//Ejercicio programado 10 Semana 1
/*Solicitar al usuario 15 números y mostrar al final la suma total*/
import java.util.Scanner;
public class Eje10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        System.out.println("Bienvenido! Este sistema le ayuda a sumar 15 numeros que usted quiera. Empezemos!");
        System.out.println("Ingrese 15 números a continuación:");
        //Bucle para acumular
        for (int i = 0; i < 15; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            total += numero;
        }
        //Muestra la suma
        System.out.println("La suma total es: " + total);
        System.out.println("Gracias por usar nuestra sistema...");
    }
}
