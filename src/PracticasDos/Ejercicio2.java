package PracticasDos;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String nombres[] = new String [5];
        String nombresInversos[] = new String [5];
        for (int i = 0; i<5;i++){
            System.out.print(" Ingrese un Nombre : ");
            nombres[i] = leer.nextLine();
        }
        int j = 0;
        for(int i = 4; i>=0 ; i--){
            nombresInversos[j] = nombres[i];
            j++;
        }
        for (int i = 0; i<5;i++){
            System.out.println(nombresInversos[i]);
            
        }
        leer.close();
    }
}
