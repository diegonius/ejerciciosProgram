import java.util.Scanner;
public class prueba1{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        System.out.println("Indique la cantidad de filas que desea rellenar ");
        int filas = input.nextInt();
        while (filas<=0){
            System.out.println("Indique la cantidad de filas mayor a 0 ");
             filas = input.nextInt();
        }
        System.out.println("Indique la cantidad de columnas que desea rellenar ");
        int columnas = input.nextInt();
        while (columnas<=0){
            System.out.println("Indique la cantidad de columnas mayor a 0 ");
             columnas = input.nextInt();
        }
        String nombre = "Ana";
        String [][]matriz = new String [filas][columnas];    
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas;j++){
                matriz [i][j]=nombre;
                System.out.print("||"+matriz[i][j] +"|| ");
            } 
            System.out.println(" ");  
        }
    
}
}
