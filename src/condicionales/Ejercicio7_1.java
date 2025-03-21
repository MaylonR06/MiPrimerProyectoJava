package condicionales;

import java.util.Scanner;

public class Ejercicio7_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresa el primer numero");
    double num1 = scanner.nextDouble();

    System.out.println("Ingresamos el segundo numero");
    double num2 = scanner.nextDouble();
    if (num1>num2) {
        double suma = num1+num2;
        double diferencia = num1-num2;
        System.out.println("la suma es"+suma);
        System.out.println("la diferencia es"+diferencia);}
        
        else{
        double producto =num1*num2;
        System.out.println("el producto es"+producto);
        double divicion = num1/num2;
        System.out.println("el resultado de la division es"+ divicion);
    }

        
    


        
    }

  }  
    

