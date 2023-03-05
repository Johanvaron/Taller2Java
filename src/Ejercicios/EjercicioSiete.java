package Ejercicios;

import java.util.Scanner;

public class EjercicioSiete {

   /**
    * @param args
    */
   public static void main(String[] args) {

        int precio ,cantidad , subtotal ,acumulador, contador;
        contador = 0;
        acumulador = 0;

        Scanner leer=new Scanner(System.in);
            for( int x=1; x<=5; x++)
            {
            System.out.println("Digite el precio del producto");
            precio=leer.nextInt();

            System.out.println("Digite la cantidad del producto");
            cantidad=leer.nextInt();
            

            contador = contador + 1;
            subtotal = precio * cantidad;
            acumulador = acumulador + subtotal;


            System.out.println("El valor a pagar por su compra es: $" + acumulador);

            System.out.println("Ingrese el pago");
            int pago;
            pago = leer.nextInt();

            System.out.println("El valor de su compra fue: $" + acumulador +"\r\n Su dinero ingresado fue: $" + pago + "\r\n Su cambio es: $" + (acumulador - pago) );

            
            System.out.println("Cuenta con telefonia exito? \r\n 1. Si \r\n 2. No");
            int respuesta;
            respuesta = leer.nextInt();

         
               
            leer.close();
            
            }


            }
         

   } 


