//Ejercicios Programados 4: Ejercicio 2
/*Solictar al usuario números hasta que se teclee uno negativo, y mostrar cuántos
números se han introducido. */
import java.util.Scanner;
public class Eje2 {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Este programa te ayudara a determinar cuantos numeros ha ingresado un usuario");
        int num = 1;
        int conta = 0;
        while (num != 0) {
            // Solicitar al usuario un número
            System.out.println("Ingrese un numero (Digite cero si quiere salir) ");
            num = scanner.nextInt();
            while(num<0){
                System.out.println("Numero incorrecto, digite un numero positivo:");
                num = scanner.nextInt();
            }
            conta++;
            if (num==0){
                conta--;
            }
        }
        System.out.println("Usted ha digitado:"+conta);
    }
}
