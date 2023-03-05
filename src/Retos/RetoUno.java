package Retos;

import java.util.Scanner;

public class RetoUno {
  public static void main(String[] args) {
        
  
    Scanner lectura= new Scanner(System.in);

    System.out.println("Ingrese los grados Fahrenheit");
    int fahrenheit;
    fahrenheit = lectura.nextInt();


    System.out.println("Los grados Fahrenheit a Centigrados son: "+(fahrenheit-32 )/1.8 +" °C"   );
    lectura.close();



}
}
