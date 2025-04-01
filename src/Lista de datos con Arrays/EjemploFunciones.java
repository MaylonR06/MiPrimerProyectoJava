public class EjemploFunciones {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        imprimirArray(numeros); 
    }

    public static void imprimirArray(int[] array) {
        for (int numero : array) {
            System.out.println("Número: " + numero);
        }

    }
}