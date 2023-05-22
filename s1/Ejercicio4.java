//Ejercicios Programados 1 Semana 1 Ejercicio #4
/*Realizar un programa que solicite 2 número enteros y muestre en pantalla la
suma, resta, división y multiplicación de estos*/

import java.util.Scanner;
public class Ejercicio4 {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Saludos terrícola! Ingresaremos dos numeros y te mostrare los resultados de las cuatros operaciones básicas");
    System.out.println("Digite el primer numero: ");
    int num1 = input.nextInt();
    while(num1<=0){
        System.out.println("Numero incorrecto, digite un numero entero:");
        num1 = input.nextInt();
    }
    System.out.println("Digite el segundo numero: ");
    int num2 = input.nextInt();
    while(num2<=0){
        System.out.println("Numero incorrecto, digite un numero entero:");
        num2 = input.nextInt();
    }
    int suma = num1+num2;
    System.out.println("La suma es: "+suma);
    int resta = num1+num2;
    System.out.println("La resta es: "+resta);
    int multi = num1+num2;
    System.out.println("La multiplicacion es: "+multi);
    int divi = num1+num2;
    System.out.println("La division es: "+divi);
    
   }
}
