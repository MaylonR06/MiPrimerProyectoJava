package practica;
import java.util.Scanner;
public class Practica1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("PORFAVOR INGRESE DOS NUMERO: ");
        double num1= leer.nextInt();
        double num2= leer.nextInt();
        if (num1>num2){
            System.out.println("LA SUMA DE "+ num1 +" y "+ num2 + " ES DE "+(num1+num2));
            System.out.println("LA DIFERENCIA DE "+ num1 +" y "+ num2 + " ES DE "+(num1-num2));
        }else if (num2>num1){
            System.out.println("LA MULTIPLICACION DE "+ num1 +" y "+ num2 + " ES DE "+(num1*num2));
            System.out.println("LA DIVICION DE "+ num1 +" y "+ num2 + " ES DE "+(num1/num2));
        }
        leer.close();
    }
}