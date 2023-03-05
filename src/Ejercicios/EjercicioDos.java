package Ejercicios;

import java.util.Scanner;

public class EjercicioDos {
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingrese su edad");
        int age;
        age = lectura.nextInt();
         
        if (age < 18) {
            System.out.println("No puede ingresar");

        } else {
            System.out.println("Puede ingresar");
        }

        lectura.close();




    }




}
