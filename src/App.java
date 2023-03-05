import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int numberOne;
        numberOne = lectura.nextInt();

        System.out.println("Ingrese otro número");
        int numberTwo;
        numberTwo = lectura.nextInt();

        lectura.nextLine();
        System.out.println("Ingrese su nombre");
        String name;
        name = lectura.nextLine();

        System.out.println("Hola  " + name +" ,los números ingresados fueron "+ numberOne + " y "+ numberTwo + ". El resultado de la sumatoria de los dos nímeros es:   "+ (numberOne+numberTwo)     );

        lectura.close();
    }
}
