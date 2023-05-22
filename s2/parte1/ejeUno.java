//Ejercicios programados 3: Ejercicio1:
/*Solicitar al usuario dos números y comprueba si son iguales.*/
import java.util.Scanner;

public class ejeUno{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Saludos! Este sistema comparará si dos números que ingrese son iguales o no: ");
        System.out.println("Digite el primer numero: ");
        int num1 = input.nextInt();
        System.out.println("Digite el segundo numero:");
        int num2 = input.nextInt();
        if (num1 != num2){
            System.out.println("Son numeros distintos");
        }else{
            System.out.println("Híjole, son iguales crack");
        }
        System.out.println("Que diantres, ya terminamos!");
    }
}