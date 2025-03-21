package condicionales;

import java.util.Scanner;

public class EjercicioB_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la primera nota");
        Double num1 = scanner.nextDouble();

        System.out.println("ingrese la segunda nota");
        Double num2 = scanner.nextDouble();

        System.out.println("ingrese la tercera nota");
        Double num3 = scanner.nextDouble();

        double promedio = num1+num2+num3/3;  // calculamos el promedio con esta formula

        //procedemos a verificar si el estudiante esta promocionado
        if (promedio>=7) {
            System.out.println("promocionado");
        }
            else
            {
            System.out.println("No promocionado");
        }
            
        }
        
 

 }
    


