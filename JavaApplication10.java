/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author gabriel_oliveira29
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n =new  Scanner (System.in);
        System.out.println("informe um número:"); 
        int n1 = n.nextInt();
        int ant =n1-1;
        int sus = n1+1;
        System.out.println("o antecessor é de"+ant);
        System.out.println("o sucessor é de"+sus);
        
   }
    
}
1 - Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.
