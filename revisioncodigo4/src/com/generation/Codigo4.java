//Brenda Alejandra Tiburcio Perez

// Reviso: Veronica Chavez - Calif: 5/5

/* Retroalimentación: Separó las partes del codigo y las acomodó de una forma más legible.
 * Faltó explicar la razón de dejar el segundo scanner (s2) en el codigo y cual es su función
 * Cerrar el codigo anterior para no tener problemas al momento de correr el código actual y poderlo visualizar debidamente
*/

package com.generation;

import java.util.Scanner;

public class Codigo4 {

   
    
    public static void PiedraPapelTijeras() { //Se escribio una función
    	 Scanner s = new Scanner(System.in); //Se importó scanner y se colocó System.in y se cambio de lugar
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j2 = s.nextLine();
    Scanner s2 = new Scanner(System.in); //Se colocó System in
   
    
    if (j1 == j2) { //Se quito parentesis
      System.out.println("Empate");
    } else {
      int g = 2;
      
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }
          
        case "tijera":
          if (j2 == "papel") { // Se hiz el cambio a ==
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
      
      s.close();
    }
  }
}
  
