
package PracticasDos;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final byte cantidadNotas = 5;
        double notas []= new double[5];
        double media = 0;
        double mayor = 0;
        double menor = 10;
        for(int i = 0; i<5 ;i++){
            System.out.print("Ingrese las notas del estudiante : ");
            notas[i]= leer.nextDouble();
            media += notas[i];
        
            if (notas[i]>mayor){
                mayor = notas[i];
            }
            if (notas[i]<menor) {
                menor = notas[i];
            }
           
       
        }
        System.out.println("la media es de "+media/cantidadNotas);
        System.out.println("La nota mayor es : "+mayor);
        System.out.println("La nota menor es : "+menor);
        leer.close();
    }
}
