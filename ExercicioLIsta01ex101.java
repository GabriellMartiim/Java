/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciolista01ex10.pkg1;

import java.util.Scanner;

/**
 *
 * @author gabriel_oliveira29
 */
public class ExercicioLIsta01ex101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner n = new Scanner (System.in);
        System.out.println("informe um número: ");
        float numero = n.nextFloat();
        float antecessor = numero-1f;
        float sucessor = numero+1f;
        System.out.println("o antecessor é de: "+antecessor);
        System.out.println("o sucessor é de: "+sucessor);
    }
    
}
