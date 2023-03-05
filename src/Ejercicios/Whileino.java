/*package Ejercicios;

import java.util.Scanner;
 public class Whileino;
    public static void main(String[] args) 
    {         int presupuestoInicial = 100000;  

         int gastosRegistrados = 0;         
         int totalGastos = 0;                 
         Scanner input = new Scanner(System.in); 
                        
         while (gastosRegistrados < 3) {             
            System.out.println("Presupuesto actual: $" + presupuestoInicial);            
             System.out.print("¿Desea registrar un gasto? (s/n) ");            
              String respuesta = input.next();                         
              if (respuesta.equals("s")) {                
                 System.out.print("Ingrese el valor del gasto: $");                 
                 int gasto = input.nextInt();                 
                 presupuestoInicial -= gasto;                 
                 totalGastos += gasto;                 
                 gastosRegistrados++;                 
                 System.out.println("Gasto registrado: $" + gasto);                 
                 System.out.println("Presupuesto restante: $" + presupuestoInicial);
                             } else if (respuesta.equals("n")) {                
                                 break;
                                            
                                 else {                 
                                    System.out.println("Respuesta inválida. Por favor ingrese 's' o 'n'");             
                                } 

        }                 System.out.println("Total de gastos registrados: $" + totalGastos);         
        System.out.println("Presupuesto restante: $" + presupuestoInicial);    
     } 
    } */