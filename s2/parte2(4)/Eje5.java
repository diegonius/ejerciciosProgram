//Ejercicios Programados 4: Ejercicio 5
/*Solicitar al usuario un número N, y mostrar todos los números del 1 al N */
import java.util.Scanner;
public class Eje5 {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Este programa te ayudará a determinar si alguien se acerca o aleja de un numero que pedimos al inicio. Empezemos!");
        System.out.println("Ingrese un numero N:");
        int ene = scanner.nextInt();
        while(ene<=1){
            System.out.println("Hijole, has ingresado un numero negativo o cero. Ingresa uno positivo diferente de 1 a continuacion: ");
            ene = scanner.nextInt();
        }
        for (int i=1;i<=ene;i++){
            System.out.println("Número: "+i); 
        }
        System.out.println("Hasta luego"); 

    }
}
