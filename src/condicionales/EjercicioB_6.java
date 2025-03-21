package condicionales;
import java.util.Scanner;
public class EjercicioB_6 {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un numero");

    int numero = scanner.nextInt();
     if(numero>0){
        System.out.println("el numero positivo es" +numero);

     }else if(numero<0){
        System.out.println("el numero negativo es"+numero);

     }else {

    System.out.println("el numero es nulo"+numero);
     }
     scanner.close();
     }
     

    }

