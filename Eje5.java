//Ejercicio programado 5 Semana 1
//Solicitar al usuario un número entre 0 y 9999 y decir cuantas cifras tiene.
import java.util.Scanner;
public class Eje5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bievenido a un sistema muy útil, te diremos cuantas cifras tiene un número... ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ingrese un número entre 0 y 9999: ");
        int numero = input.nextInt();
        while(numero < 0 || numero > 9999){
            System.out.println("El número ingresado es cero. Coloque uno correcto ");
            numero = input.nextInt();
        }
        //Entramos a una condicion para ver la cantidad de numeros e informarle al usuario
        if (numero >= 0 && numero <= 9999) {
            int cantidadNum = 1;
            if (numero == 0) {
                cantidadNum = 1; // Caso especial para el número 0
            } else {
                while (numero != 0) {
                    cantidadNum++; //incrementa hasta llegar a 9999
                    numero /= 10; //lo divide para que me saque
                }
            }
            System.out.println("El número tiene " + cantidadNum + " cifra(s).");
        } else {
            System.out.println("Por si no se dió cuenta, se pasó de numeros... Ni modo, te jodes y vuelves a empezar :))");
        }
        System.out.println("...............................");
        System.out.println("Esperamos haberte ayudado, que tengas un día muy productivo y feliz :D");
        System.out.println("...............................");
    }
}
