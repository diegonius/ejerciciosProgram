//Ejercicios programados 3: Ejercicio3:
/*Solicitar al usuario un número entero y determinar si es múltiplo de tres y de
cinco*/

import java.util.Scanner;
public class ejeTres {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Un saludo cordial. Este sistema determinará si el numero que DIGITE USTED será multiplo de 3 y de 5.");
        System.out.println("Por favor, digite un numero:");
        int num = input.nextInt();
        while(num<=0){
            System.out.println("Numero incorrecto, digite un numero entero:");
            num = input.nextInt();
        }
        if (num%3==0){
            System.out.println("Que suertudo, lo que digitaste es multiplo de 3"); 
        }else{
            System.out.println("Que sal, lo que digitaste NO es multiplo de 3");  
        }
        if (num%5==0){
            System.out.println("Que maravilla, lo que digitaste es multiplo de 5");
        }else{
            System.out.println("Nombres, ni a palos ese numero es multiplo de 5");
        }
        System.out.println("Gracias por usar nuestro programa. Que tengas un día super genial");
    }
}
