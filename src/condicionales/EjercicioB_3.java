package condicionales;
import java.util.Scanner;

public class EjercicioB_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        
        byte numero = scanner.nextByte();
        
         if(numero >= 1 && numero<=99){
            
            if (numero<=9) {
            System.out.println("numeros de dos digitos");
            
            } else {
                 System.out.println("numeros de dos digitos");
            }
        }else{
             System.out.println("fuera de rango");
          }
          scanner.close();

    }
}
