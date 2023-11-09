
package vetorex2;

import java.util.Scanner;


public class VetorEx2 {

   
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        int[] numero= new int[5];
        float preco =0.0f;
        for(int i = 0;i<5;i++){
            System.out.println("Informe o preço do "+(i+1)+" produto:");
            numero[i]=n.nextInt();
            preco = preco+numero[i];
            
        }
        System.out.println("O valor total é de:"+preco);
    }
            
                    
    
}
