//Ejercicios Programados 1 Semana 1 Ejercicio #2
/*Realizar un programa que recibe un número en grados Celsius y convertirlos en
Fahrenheit, mostrando el resultado en pantalla, recuerde que la fórmula para
obtener dicho calculo es al siguiente:
(Celsius * 9 / 5) + 32 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un registro en grados celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0/5)*celsius+32;
        System.out.println("El resultado en grados Fahrenheit es: "+fahrenheit);
        System.out.println("Hasta luego");
    }
}
