/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciolista01ex03;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ExercicioLista01ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("informe o valor de v1: ");
        float valor1 = n.nextFloat();
        System.out.println("informe o valor de v2: ");
        float valor2 = n.nextFloat();
        System.out.println("a soma dos dois valores é de: " +valor1+valor2);
        System.out.println("a multiplicação dos dois valores é de: " +valor1*valor2);
        System.out.println("a subtração dos dois valores é de: "+(valor1-valor2)); 
       System.out.println("a divisão dos dois valores é de: "+valor1/valor2);
   }
    
}
