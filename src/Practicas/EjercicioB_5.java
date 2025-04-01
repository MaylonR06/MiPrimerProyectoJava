package condicionales;

import java.util.Scanner;

public class EjercicioB_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese un numero");
        int num2 = scanner.nextInt();

        if (num1 > num2){
        System.out.println("es el mayor el "+num1);
        }else {
            System.out.println("es el mayor el"+num2);
        

        }



scanner.close();


    }
    
}
