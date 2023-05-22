//Ejercicios programados 3: Ejercicio 6:
/*Solicitar al usuario tres números enteros H, M, S correspondientes a hora,
minutos y segundos respectivamente, y comprueba si la hora que indican es una
hora válida.*/
import java.util.Scanner;
public class ejeSeis {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hola! Verificaremos si la hora, minutos y segundos que ingresas son correctos:");
        System.out.println("Ingrese una hora (usando 2 numeros. Ej: 01,03,05): ");
        int horas = input.nextInt();
        System.out.println("Ingrese los minutos (usando 2 numeros. Ej: 01,03,05): ");
        int min = input.nextInt();
        System.out.println("Ingrese los segundos (usando 2 numeros. Ej: 01,03,05): ");
        int seg = input.nextInt();
        if (horas<=24 && min<=60 && seg<=60){
            System.out.println("La hora es correcta :) ");
        }else{
            System.out.println("La hora no es correcta :S");
        }
        System.out.println("Adios!");
    }
}
