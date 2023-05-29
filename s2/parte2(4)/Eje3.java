//Ejercicios Programados 4: Ejercicio 3
/*Solicitar al usuario un número para adivinar. Para ello pedir un número N, y
luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor
con respecto a N. El proceso termina cuando el usuario acierta */
import java.util.Scanner;
public class Eje3 {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Este programa te ayudará a determinar si alguien se acerca o aleja de un numero que pedimos al inicio. Empezemos!");
        System.out.println("Ingrese un numero N:");
        int ene = scanner.nextInt();
        while(ene<0){
            System.out.println("Hijole, has ingresado un numero negativo o cero. Ingresa uno positivo a continuacion: ");
            ene = scanner.nextInt();
        }
        System.out.println("Ingrese un numero cualquiera:");
        int num = scanner.nextInt();
        while(num!=ene){
            if (num>ene){
                System.out.println("Has ingresado un numero MAYOR a N");
                System.out.println("Prueba otra vez:");
                num = scanner.nextInt();
            }else if(num<ene){
                System.out.println("Has ingresado un numero MENOR a N");
                System.out.println("Prueba otra vez:");
                num = scanner.nextInt();
            }else{
                System.out.println("Has digitado cero!");
                System.out.println("Prueba otra vez:");
                num = scanner.nextInt();
            }
        }
        System.out.println("Si, has adivinado, N era: "+ene);
        System.out.println("Gracias por jugar!");

    }
}
