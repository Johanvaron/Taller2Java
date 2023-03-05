package Retos ;
import java.util.Scanner;

public class RetoCinco{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();

        
        int longitudNombre = nombre.length();
        int longitudApellido = apellido.length();

        System.out.println("La longitud de tu nombre es: " + longitudNombre);
        System.out.println("La longitud de tu apellido es: " + longitudApellido);

        
        String nombreMayusculas = nombre.toUpperCase();
        String apellidoMinusculas = apellido.toLowerCase();

        System.out.println("Tu nombre en mayúsculas es: " + nombreMayusculas);
        System.out.println("Tu apellido en minúsculas es: " + apellidoMinusculas);

        
        String nombreCompleto = nombre + " " + apellido;

        System.out.println("Tu nombre completo es: " + nombreCompleto);

        
        String inicialesNombre = nombre.substring(0, 2);
        String nombreApellido = inicialesNombre + apellido;

        System.out.println("Tus iniciales son: " + inicialesNombre);
        System.out.println("Tu nombre y apellido unidos son: " + nombreApellido);
       
    }
}
