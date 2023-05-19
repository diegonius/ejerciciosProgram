//Ejercicio programado 12 de la Semana 1
/*Solicitar al usuario 10 números, mostrando al final si se ha introducido alguno
negativo*/
import java.util.Scanner;
public class Eje12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Se usa un booleano para cuando aparezca un negativo
        boolean hayNegativo = false;
        System.out.println("Ingrese 10 números a continuacion:");
        //Para ir haciendo un bucle para llenar diez numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            //Cuando hay uno negativo
            if (numero < 0) {
                hayNegativo = true;
            }
        }
        //Verificacion de negativo o no
        if (hayNegativo) {
            System.out.println("Si se ha ingresado antes algun numero negativo.");
        } else {
            System.out.println("No se ha ingresado ningún numero negativo.");
        }
        System.out.println("Gracias por usar el sistema.");
    }
}
