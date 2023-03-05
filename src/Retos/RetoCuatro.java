package Retos;

import java.util.Random;
import java.util.Scanner;

public class RetoCuatro {

    public static void main(String[] args) {
        
        String[] opciones = {"piedra", "papel", "tijera"};
    
        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();
        
        String eleccionUsuario;
        
        String eleccionMaquina;
        
        int resultado;
        
        while (true) {
            
            System.out.print("Seleccione su opción (piedra, papel o tijera): ");
            eleccionUsuario = scanner.nextLine().toLowerCase();
            
            if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijera")) {
                System.out.println("La opción seleccionada no es válida. Por favor, inténtelo de nuevo.\n");
                continue;
            }
            
            eleccionMaquina = opciones[random.nextInt(3)];
            System.out.println("La máquina ha seleccionado " + eleccionMaquina + ".");
            
            if (eleccionUsuario.equals(eleccionMaquina)) {
                resultado = 0; 
            } else if ((eleccionUsuario.equals("piedra") && eleccionMaquina.equals("tijera")) || (eleccionUsuario.equals("papel") && eleccionMaquina.equals("piedra")) || (eleccionUsuario.equals("tijera") && eleccionMaquina.equals("papel"))) {
                resultado = 1; 
            } else {
                resultado = -1; 
            }
        
            if (resultado == 0) {
                System.out.println("Empate.\n");
            } else if (resultado == 1) {
                System.out.println("¡Ha ganado el usuario!\n");
            } else {
                System.out.println("Ha ganado la máquina.\n");
            }
            

            System.out.print("¿Quieres jugar de nuevo? (s/n): ");
            if (!scanner.nextLine().toLowerCase().equals("s")) {
                break;
            }
            
            System.out.println();
        }
        scanner.close();
    }

}


