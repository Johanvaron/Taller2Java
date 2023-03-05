package Ejercicios;

import java.util.Scanner;

public class EjecicioTres {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int numberOne;
        numberOne = lectura.nextInt();

        System.out.println("Ingrese otro número");
        int numberTwo;
        numberTwo = lectura.nextInt();


        if (numberOne > numberTwo) {
            System.out.println("El número " + numberOne + " es mayor que el número " + numberTwo);
            int operationOne = numberOne + numberTwo;
            System.out.println("El resultado de la suma es: "+ operationOne);
   
        } else {
            System.out.println("El número " + numberTwo + " es menor que el número " + numberOne);
            int operationTwo = numberTwo - numberOne;
            System.out.println("El resultado de la resta es: "+ operationTwo);
            
        }

        lectura.close();
    }
}