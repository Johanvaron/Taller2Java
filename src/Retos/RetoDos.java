package Retos;

import java.util.Scanner;

public class RetoDos {
  public static void main(String[] args) {
    Scanner lectura= new Scanner(System.in);


      System.out.println("Ingrese el peso del bebe:   ");
      int pesoBb;
      pesoBb = lectura.nextInt();

      System.out.println("Ingrese los mese del bebe:  ");
      int mesesBb;
      mesesBb = lectura.nextInt();

      double resultado = (double)(pesoBb + 10) / (mesesBb * 10) * 8;
   
      System.out.println("la dosis del bebe es de: " + resultado );

      lectura.close();

}
}
