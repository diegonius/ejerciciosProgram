//Ejercicios programados 3: Ejercicio2:
/*Solictar al usuario un número entero, muestre en pantalla el doble y el triple de
ese número*/
import java.util.Scanner;

public class ejeDos{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido. Este sistema te dirá el doble y el triple del numero que digite a continuacion");
        System.out.println("Para empezar, digite un número, el que quiera: ");
        int num1 = input.nextInt();
        while(num1<=0){
            System.out.println("Numero incorrecto, digite un numero entero:");
            num1 = input.nextInt();
        }
        int num2 = num1*num1;
        int num3 = num1*num1*num1;
        System.out.println("De acuerdo, has digitado: "+num1);
        System.out.println("El doble de ese numero es: "+num2);
        System.out.println("El triple de ese numero es "+num3);
        
    }
}