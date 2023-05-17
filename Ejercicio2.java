import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("SISTEMA DE CONVERSION DE CELSIUS");
        System.out.println("Ingrese un registro en grados celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0/5)*celsius+32;
        System.out.println("El resultado en grados Fahrenheit es: "+fahrenheit);
        System.out.println("Good byeeeeeeeeeeeeeeee!");
    }
}
