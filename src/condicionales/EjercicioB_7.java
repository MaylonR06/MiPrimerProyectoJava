package condicionales;
import java.util.Scanner;
public class EjercicioB_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un número entero positivo de 1, 2 o 0 tres cifras");
        int num = scanner.nextInt();
        if (num>0 && num<9) {
            System.out.println("El numero" + num+ " es de 1 cifra" );
            
        }else if (num>9 && num<99){
            System.out.println("El numero" + num+ "es de dos cifras");

        }else if (num>100 && num<999){
            System.out.println("El numero" + num+ "es de 3 cifras");
        }else {
            System.out.println("error, es numero esta fuera del rango que se la pide o indica");
            
        
        }
        scanner.close();
    }
}