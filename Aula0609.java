
package aula.pkg0609;

import javax.swing.JOptionPane;


public class Aula0609 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nome = JOptionPane.showInputDialog("Informe seu  nome: ");
      JOptionPane.showMessageDialog(null,"Olá, seja bem vindo, "+nome);
      int idade = Integer.parseInt(JOptionPane.showInputDialog("informe a idade:"));
      JOptionPane.showMessageDialog(null,"sua idade é: "+idade);
        
      float peso = Float.parseFloat(JOptionPane.showInputDialog("informe seu peso :" ));
      JOptionPane.showMessageDialog(null,"o peso é de: "+peso);
      
      double salario = Double.parseDouble(JOptionPane.showInputDialog("informe seu salario:"));
      JOptionPane.showMessageDialog(null,"seu salario é de $: "+salario);
      
      JOptionPane.showMessageDialog(null,"seu nome é: "+nome+""
              +"\nSua idade é de: "+idade + ""
              +"zn O peso informado foi:"+peso+""
              + "\n O salario infrormado :"+salario);
      
      
    }
    
    
}
