//Ejercicio programado 11 de la Semana 1
/*Solcitar al usuario un número N de sueldos, y mostrar el sueldo máximo*/
import java.util.Scanner;
public class Eje11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este sistema te ayudará a ver cual sueldo es el mayor");
        //Pedimos el numero de sueldo para usarlo como limite para el bucle
        System.out.println("Ingrese el número de sueldos: ");
        int n = scanner.nextInt();
        //Validacion para evitar que el usuario coloque cero
        if (n <= 0) {
            System.out.println("El número de sueldos debe ser mayor a cero.");
            return;
        }
        System.out.println("Ingrese los sueldos a continuación");
        //Para iniciar la burbuja de sueldo máximo
        int sueldoMaximo = 0;
        //Para empezar a ingresar los sueldos y a compararse con el máximo
        for (int i = 0; i < n; i++) {
            System.out.println("Sueldo " + (i + 1) + ": ");
            int sueldo = scanner.nextInt();
            //Esto es por cada tiro que se ejecuta el bucle, si se mete uno mayor al anterior, queda asignado a sueldoMaximo
            if (i == 0 || sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
        }
        System.out.println("El sueldo máximo es: " + sueldoMaximo);
        System.out.println("...................");
        System.out.println("Hasta luego lucas!");
        System.out.println("...................");
    }
}
