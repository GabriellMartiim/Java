/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciolista01ex05;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ExercicioLista01ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner n= new Scanner (System.in);
        System.out.println("Informe anos,meses, dias que você tem de vida");
        System.out.println("informe quantos anos você tem: ");
        int anos = n.nextInt();
        System.out.println("informe quantos meses você tem: ");
        int meses = n.nextInt();
        System.out.println("informe quantos dias você tem: ");
        int dias = n.nextInt();
        int total = (anos*365)+(meses*30)+dias;
        System.out.println("Você tem um total de: " + total + " dias de vidas");
    }
    
}
