//Ejercicios Programados 4: Ejercicio 1
/*Solicitar al usuario un número y mostrar su cuadrado, repetir el proceso hasta
que se introduzca un número negativo. */
import java.util.*;
import java.lang.Math;

public class Eje1 {
    public static void main (String [] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Este programa te ayudara a determinar el cuadrado de un numero.");
        double num = 1;
        double exp = 2;
        double resultado = 0;
        while (num != 0) {
            // Solicitar al usuario un número
            System.out.println("Ingrese un numero (Digite cero si quiere salir) ");
            num = scanner.nextInt();
            while(num<0){
                System.out.println("Numero incorrecto, digite un numero positivo:");
                num = scanner.nextInt();
            }
            resultado = Math.pow(num, exp);
            System.out.println("El cuadrado del numero: "+num+" es: "+resultado);
        }
        System.out.println("Gracias por usar el programa :)");
    }
    
}
