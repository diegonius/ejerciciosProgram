//Ejercicio Programado 4 Semana 1:
//Solicitar al usuario tres números y mostrarlos ordenados de mayor a menor

import java.util.Scanner;
public class Eje4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola! Este sistema te ayudara a ordenar tres numeros que elijas, empezemos!");
        // Solicita al usuario los tres números
        System.out.println("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        while(num1<=0){
            System.out.println("El número ingresado es cero. Coloque otro que sea entero ");
            num1 = scanner.nextInt();
        }
        System.out.println("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        while(num2<=0){
            System.out.println("El número ingresado es cero. Coloque otro que sea entero ");
            num2 = scanner.nextInt();
        }
        System.out.println("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();
        while(num3<=0){
            System.out.println("El número ingresado es cero. Coloque otro que sea entero ");
            num3 = scanner.nextInt();
        }
        // Ordenamos los números de mayor a menor utilizando comparaciones
        int mayor, medio, menor;
        // Comparación para obtener el número mayor
        mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        // Comparación para obtener el número menor
        menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        // Obtener el número de en medio
        medio = num1 + num2 + num3 - mayor - menor;
        // Mensajes finales para decir los números ordenados de mayor a menor
        System.out.println("Los números ordenados de mayor a menor son: " + mayor + ", " + medio + ", " + menor);
        System.out.println("---------------- ");
        System.out.println("Gracias por usar nuestro sistema. Adios :) ");
    }
}




