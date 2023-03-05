package Ejercicios;

import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int numberOne;
        numberOne = lectura.nextInt();


        System.out.println("Ingrese otro número");
        int numberTwo;
        numberTwo= lectura.nextInt();

            if (numberOne > 0 ) {
                System.out.println(numberOne + " es positivo." );
            } else if( numberOne < 0) {
                System.out.println(numberOne + " es negativo."); 
            }
            else {
                System.out.println(numberOne + " es neutro.");
            }

            if (numberTwo > 0 ) {
                System.out.println(numberTwo + " es positivo." );
            } else if( numberTwo < 0) {
                System.out.println(numberTwo + " es negativo."); 
            }
            else {
                System.out.println(numberTwo + " es neutro.");
            }

                if (numberOne == numberTwo){
                    System.out.println(numberOne + " y " + numberTwo + " son iguales");
                    System.out.println("El resultado de la multipicaión entre estos dos son: " + (numberOne + numberTwo) );
                } else {
                    System.out.println(numberOne + " y " + numberTwo + " no son iguales");
                }
        lectura.close();
    }
}