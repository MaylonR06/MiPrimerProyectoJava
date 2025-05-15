package PracticasDos;
 import java.util.Scanner;
 public class Ejercicio6 {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         String[] meses = {
             "Enero", "Febrero", "Marzo", "Abril",
             "Mayo", "Junio", "Julio", "Agosto",
             "Septiembre", "Octubre", "Noviembre", "Diciembre"
         };
         int[] dias = {
             31, 28, 31, 30,
             31, 30, 31, 31,
             30, 31, 30, 31
         };
         System.out.println("Ingresa un número de mes: ");
         int num = leer.nextInt();
         num-=1;
         System.out.println("el mes "+meses[num]+"tiene "+dias[num]+" dias");
         leer.close();
     }
 }
 