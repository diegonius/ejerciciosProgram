import java.util.Scanner;
public class Ejercicio3 {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("BIENVENIDO AL SISTEMA DE CALCULO DE VALORES");
    System.out.println("Por favor ingrese el radio del círculo: ");
    double radio = input.nextDouble();;
    double piC = 3.14; 
    double radeichon = radio*2;
    System.out.println("El radio elevado a la dos da : "+radeichon);
    double area = piC*radeichon;
    System.out.println("El area es de : "+area);
    double perimetro = 2*piC*radio;
    System.out.println("El perimetro es de : "+perimetro);
    
   } 
}
