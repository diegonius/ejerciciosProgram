//Ejercicio programado 6 Semana 1:
/*Solicitar al usuario el día, mes y año de una fecha e indicar si la fecha es
correcta. Suponiendo todos los meses de 30 días*/
import java.util.Scanner;
public class Eje6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema verificador de fechas v1.0 ");
        // Solicitar al usuario el día, mes y año
        System.out.println("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año: ");
        int anio = scanner.nextInt();
        // Verificar si la fecha es correcta
        boolean fechaCorrecta = true;
        if (dia < 1 || dia > 30 || mes < 1 || mes > 12 || anio < 1 || anio > 9999) {
            fechaCorrecta = false;  // Verificar si los valores están dentro de lo permitido
        }
        // Mostrar el resultado
        if (fechaCorrecta) {
            System.out.println("La fecha ingresada es correcta.");
        } else {
            System.out.println("La fecha ingresada es incorrecta.");
        }
        System.out.println("Hasta luego ");
    }
}

