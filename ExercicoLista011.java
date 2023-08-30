/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicolista01.pkg1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ExercicoLista011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("informe o valor da base do triangulo retangulo: ");
        int base = n.nextInt();
        System.err.println("informe a altura do triangulo retangulo: ");
        int altura = n.nextInt();
        
        int area = (base*altura)/2;
        System.out.println("informe a area do triangulo retangulo é de: "+area);
    }
    
}
