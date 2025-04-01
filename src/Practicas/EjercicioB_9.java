package practica;
import java.util.Scanner;
public class Practica9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" INGRESE LAS TRES NOTAS DEL ESTUDIANTE : ");
        double Nota1 = leer.nextDouble();
        double Nota2 = leer.nextDouble();
        double Nota3 = leer.nextDouble();
        double Promedio = (Nota1 +Nota2+Nota3)/3;
        if (Promedio>=7){System.out.println("PROMOCIONADO");}
        else if (Promedio>=4 && Promedio<7){System.out.println("REGULAR");}
        else{System.out.println("REPROBADO");}
        leer.close();
    }
}
