//--Ejercicio Programados 1 Semana 1 Ejercicio #1
/*Realizar un programa que reciba un número y determine si es par o impar,
mostrándolo en pantalla */

import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numerillo: ");
        int num = input.nextInt();
        if (num%2==0){
            System.out.println("Es par ");
        }else{
            System.out.println("Impar");
        }
    }
}
