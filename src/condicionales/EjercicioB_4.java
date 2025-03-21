package condicionales;
import java.util.Scanner;
public class EjercicioB_4 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Ingrese su sueldo");
      short sueldo = scanner.nextShort();

      if(sueldo > 3000){
      System.out.println("Debe abonar impuestos.  :(");
      }else {
        System.out.println("No debe abonar nada, su merce queda paz y salvo.");
      }

scanner.close();







    }
    
}
