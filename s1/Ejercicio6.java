//Ejercicios Programados 1 Semana 1 Ejercicio #6
/*Realizar un programa que reciba un numero entero y muestre sus
multiplicaciones del 1 al 10 en pantalla.*/
import java.util.Scanner;
public class Ejercicio6 {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int num = input.nextInt();
        while(num<=0){
            System.out.println("Numero incorrecto, digite un numero entero:");
            num = input.nextInt();
        }
        System.out.println("Tabla de multiplicacion de: " +num);
        for (int i = 1; i <= 10; i++){
            int multi=0;
            multi=num*i;
            System.out.println(num+" X "+i+" es: "+multi);
         };
        
    }
}
