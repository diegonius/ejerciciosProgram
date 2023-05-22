//Ejercicios programados 3: Ejercicio 4:
/*Solicitar al usuario un año y determine si es un año bisiesto o no. Un año es
bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400*/
import java.util.Scanner;
public class ejeCuatro {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hola. Vamos a ver si el año es bisiesto o no.");
        System.out.println("Por favor, ingrese un año: ");
        int numAnio = input.nextInt();
        if (numAnio%4==0 && numAnio%100!=0 || numAnio%400==0){
            System.out.println("El año es bisiesto");
        }else{
            System.out.println("El año no es bisiesto");
        }
        System.out.println("Vio? Ya terminamos. Adios!");
    }
}
