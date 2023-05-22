import java.util.Scanner;

public class Eje3 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int numero1 = input.nextInt();
        while(numero1<=0){
            System.out.println("El número ingresado es cero. Coloque ");
            numero1 = input.nextInt();
        }
        System.out.print("Ingresa el segundo número: ");
        int numero2 = input.nextInt();
        while(numero2<=0){
            System.out.println("El número ingresado es cero. Coloque ");
            numero2 = input.nextInt();
        }
        if (numero1 > numero2) {
            System.out.println("El primer numero es mayor");
        } else if (numero2 > numero1) {
            System.out.println("El segundo numero es mayor");
        } else {
            System.out.println("Vaya! Ambos números son iguales");
        }
        System.out.println("------------------");
        System.out.println("Hasta luego lucas!");
    }
}
