//Ejercicios Programados 4: Ejercicio 2
/*Solicitar al usuario todos los números del 100 al 0 de 7 en 7*/
import java.util.Scanner;

public class Eje4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A continuacion verás los números del 100 al 0 de 7 en 7:");
        int numero = 100;
        while (numero >= 0) {
            System.out.println(numero);
            numero -= 7;
        }
    }
}
