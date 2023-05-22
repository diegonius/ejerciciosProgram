//Ejercicios programados 3: Ejercicio 5:
/*Solicitar al usuario una cantidad de millas y calcule su equivalente en
Kilómetros. El proceso se repite hasta que se introduzca un 0 como valor para las
millas.1 Milla equivale a 1.6093 Kilómetros*/
import java.util.Scanner;
public class ejeCinco {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("BIENVENIDO, este sistema le ayudará a sacar las millas x hora de una cantidad de km que usted digite.");
        int numero = 1;
        double millas = 1.6093, resultado;
        while (numero != 0) {
            // Solicitar al usuario un número de kilometros por hora
            System.out.println("Ingrese un valor en kilometros (Digite cero si quiere salir) ");
            numero = scanner.nextInt();
            while(numero<0){
                System.out.println("Numero incorrecto, digite un numero positivo:");
                numero = scanner.nextInt();
            }
            resultado = numero*millas;
            System.out.println("Su valor en km equivale en millas a: "+resultado);
        }
        System.out.println("Hasta luego, que te vaya bien!");
    }
}
