/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelse;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel_oliveira29
 */
public class Ifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int idade = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade: "));
       
       if(idade<18){
           JOptionPane.showMessageDialog(null,"Menor de idade, "+idade+" anos");
       }else if(idade>= 18 && idade <65){
           JOptionPane.showMessageDialog(null,"Adulto, "+idade+" anos");
       }else{
           JOptionPane.showMessageDialog(null,"idoso, "+ idade+ " anos");
           
       }
    }
    
}
