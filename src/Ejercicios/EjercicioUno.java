package Ejercicios;

import java.util.Scanner;

public class EjercicioUno {

   public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de productos");
    int cantidad;
    cantidad = lectura.nextInt();



    int valorTotal = cantidad * 10000;
    System.out.println("El valor de la compra es: " + valorTotal);



    System.out.println("Ingrese su pago: ");
    int pago;
    pago = lectura.nextInt();



    int cambio = (pago - valorTotal);
    System.out.println("Su cambio es: " + cambio);
    lectura.close();



   } 

}