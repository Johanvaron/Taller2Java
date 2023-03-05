package Ejercicios;

import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int numberOne, numberTwo, operation;
        double  total,totalOne, totalTwo;
        numberOne =lectura.nextInt();

        
        System.out.println("Ingrese el otro número");
        numberTwo = lectura.nextInt();

        System.out.println("1.Suma\r\n2.Resta\r\n3.Multiplicación\r\n4.División\r\n5.Potetenciación\r\n6.Radicación");
        operation = lectura.nextInt();

        switch (operation) { 
            case 1:
                total = numberOne + numberTwo;
                System.out.println("La suma entre " + numberOne + " y " + numberTwo +" es "+total);
             break;

            case 2:
                total = numberOne - numberTwo;
                System.out.println("La resta entre " + numberOne + " y " + numberTwo +" es "+total);
             break;

            case 3:
                total = numberOne * numberTwo;
                System.out.println("La multiplicación entre " + numberOne + " y " + numberTwo +" es "+total);
            break;

            case 4:
                total =  numberOne / numberTwo;
                System.out.println("La división entre " + numberOne + " y " + numberTwo +" es "+total);
            break;
    
            case 5:
                total =  Math.pow(numberTwo, numberOne);
                System.out.println("La potenciación entre " + numberOne + " y " + numberTwo +" es "+total);
            break;
            case 6:
                totalOne = Math.sqrt(numberOne);
                totalTwo = Math.sqrt(numberOne);
                System.out.printf("La radicación" + " de " + numberOne + " y " + numberTwo +" es: "+ totalOne , totalTwo);  
            break;
            default:
            System.out.println("La opción seleccionada no es válida");
          }

        lectura.close();
    }
}