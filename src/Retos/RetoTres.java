package Retos;

import java.util.Scanner;

public class RetoTres {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
    
    
          System.out.println("Seleccione: \r\n1. Cara\r\n2. Sello   ");
          int option;
          option = lectura.nextInt();
    
            switch (option) {
                 case 1:
                    
                 break;


                 case 2:
                
                 break;
                 default:
                 System.out.println("La opción seleccionada no es válida");
                 break;
            }
    
          lectura.close();
    
    } 
}
