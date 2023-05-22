//Ejercicios Programados 1 Semana 1 Ejercicio #3
/*Realizar un programa que calcule el área y perímetro de un círculo, donde
solicite el radio, el resultado debe mostrarlo en pantalla, recuerde que la fórmula
para obtener el área es: A = π r² y al perímetro es: 2.π x r.*/

import java.util.Scanner;
import java.lang.Math;
public class Ejercicio3 {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("BIENVENIDO AL SISTEMA DE CALCULO DE VALORES");
    System.out.println("Por favor ingrese el radio del círculo: ");
    double radio = input.nextDouble();
    double piC = 3.14; 
    double area = piC*Math.pow(radio,2);
    System.out.println("El area es de : "+area);
    double perimetro = 2*piC*radio;
    System.out.println("El perimetro es de : "+perimetro);
    
   } 
}