//Ejercicios Programados 1 Semana 1 Ejercicio #5
/*Realizar un programa que solicite un número y realizar el factorial de este
mostrándolo en pantalla */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int num = input.nextInt();
        while(num<=0){
            System.out.println("Numero incorrecto, digite un numero entero:");
            num = input.nextInt();
        }
        int acum=1;
        //Bucle para sacar el factorial
        for (int i = 1; i <= num; i++){
           acum=acum*i;
           System.out.println("Factorial "+i+" de "+num+" es: "+acum);

        };
    }
}
