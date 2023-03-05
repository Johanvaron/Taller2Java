package Ejercicios;

import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int number;
        number = lectura.nextInt();

        if (number > 0 ) {
            System.out.println(number + " es positivo." );
        } else if( number < 0) {
            System.out.println(number + " es negativo."); 
        }
        else {
            System.out.println(number + " es neutro.");
        }
        lectura.close();
    }
}