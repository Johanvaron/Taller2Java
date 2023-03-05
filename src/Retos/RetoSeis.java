package Retos;

import java.util.Scanner;
import java.util.Random;

public class RetoSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        
        while (true) {
           
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int total = dado1 + dado2;

            
            String resultado;
            if (total == 2 || total == 12) {
                resultado = "perdiste";
            } else if (total == 3 || total == 11) {
                resultado = "ganaste";
            } else if (dado1 == 1 && dado2 == 1) {
                resultado = "ganaste";
            } else if (total == 7) {
                resultado = "ganaste";
            } else {
                resultado = "perdiste";
            }

            
            System.out.printf("Lanzamiento: %d + %d = %d\n", dado1, dado2, total);
            System.out.printf("Resultado: %s\n\n", resultado);

            
            System.out.print("¿Quieres jugar de nuevo? (s/n) ");
            String respuesta = sc.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }
        }
    }
}
