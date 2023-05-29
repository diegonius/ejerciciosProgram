//Prueba Corta 1
/*Solicitar al usuario filas y columnas las cuales deberá recorrer para rellenar con
su nombre */
import java.util.*;
public class prueba_corta1 {
    public static void main(String[]args){
        int columnas = 0;
        int filas = 0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese un numero de columnas");
        columnas = scanner.nextInt();
        System.out.println("Ingrese un numero de filas");
        filas = scanner.nextInt();
        while(columnas<=0){
            System.out.println("Por favor ingrese un numero positivo y diferente a cero: ");
            columnas = scanner.nextInt();
        }
        while(filas<=0){
            System.out.println("Por favor ingrese un numero positivo y diferente a cero: ");
            filas = scanner.nextInt();
        }
        String nombre= "Luis";
        String matriz[][] = new String[filas][columnas];
        for(int i=0;i<filas;i++){
           for(int y=0;i<columnas;y++){
            matriz[i][y]= nombre;
           }
        }
        System.out.println(matriz);  
    }
}
