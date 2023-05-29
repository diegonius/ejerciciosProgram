//Ejercicios Programados 4: Ejercicio 5
/*Solicitar al usuario un número N, y mostrar todos los números del 1 al N */
import java.util.Scanner;
public class Eje6 {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Este programa te ayudará a determinar cuantos salarios son superiores a los 100.000 colones.");
        int cantSalarios = 10;
        int acumSalarios = 0, cantCien = 0, salario;
        for (int i=1;i<=cantSalarios;i++){
            System.out.println("Ingrese un salario");
            salario = scanner.nextInt();
            while(salario<=0){
                System.out.println("Error, has ingresado un salario negativo o de cero. Ingresa uno positivo a continuacion: ");
                salario = scanner.nextInt();
            }
            acumSalarios=salario+acumSalarios;
            if (salario>=100000){
                cantCien++;
                System.out.println("Han sido detectado: "+cantCien+" salarios superiores a 100.000 colones");
            }else{
                System.out.println("Salario: "+i+" procesado correctamente");
            }
        }
        System.out.println("La suma de salarios da: "+acumSalarios+" y se reportaron: "+cantCien+" mayores a cien mil colones");
        System.out.println("Hasta luego, gracias por usar nuestros servicios..."); 
    }
}
