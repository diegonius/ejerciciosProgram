import java.util.Scanner;
public class Eje1 {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema...");
        System.out.println("Ingresa un número: ");
        int numero = scanner.nextInt();
        while(numero==0){
            System.out.println("El número ingresado es cero.");
            numero = scanner.nextInt();
        }
        if (numero > 0) {
            System.out.println("El número ingresado es positivo.");
        }else{
            System.out.println("El número ingresado es negativo.");
        }
            
        System.out.println("Hasta luego!");
    }  
}