import java.util.Scanner;

public class Eje2 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int numero1 = input.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int numero2 = input.nextInt();
        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " es múltiplo de " + numero2);
        } else if (numero2 % numero1 == 0) {
            System.out.println(numero2 + " es múltiplo de " + numero1);
        } else {
            System.out.println("Los números no son múltiplos entre sí");
        }
    }
}
