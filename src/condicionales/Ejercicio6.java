package condicionales;
import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("INGRESE UN NUMERO PARA SABER SI ES PERFECTO: ");
        int enteros = leer.nextInt();
        int guardar = 0;
        for(int i = 1; i <= enteros;i++){
         if (i % 2 == 0 ){
             guardar += i;
            }
        }
        if (guardar == enteros){
           System.out.println("el numero ingresado si es un numero perfecto");
        }else {
               System.out.println("no es un numero perfecto");
           }
        leer.close();
    }
}