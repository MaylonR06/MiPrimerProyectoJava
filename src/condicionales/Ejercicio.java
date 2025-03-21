package condicionales;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //PARA INGRESAR EL PRIMER NUMERO
System.out.println("ingrese el primer numero");    //Muestra un mensaje en la pantalla sin salto de línea para que el usuario pueda escribir a continuación.//
double num1 = scanner.nextDouble();  //aqui asignamos al numero como double y despues el scanner..... lo agarra y lo guarda como un numero double

System.out.println("ingrese el segundo numero");
double num2 = scanner.nextDouble();

if (num1>num2){
    double suma = num1+num2;
    double diferencia = num1-num2;
    System.out.println("la suma es: " + suma);
    System.out.println("la diferencia es: " + diferencia);
}
else{
    double producto = num1*num2;
    System.out.println("el producto es"+ producto);

    double divicion = num1/num2;
    System.out.println("el resultado de la division es"+ divicion);

    
    // Verificar que num2 no sea cero antes de dividir
    
}




    }

}
