
package exercicio18;

public class Exercicio18 {

    
    public static void main(String[] args) {
        int numero = 1738;
        int unidade = numero % 10;
        int dezena = (numero / 10) % 10;
        int centena = (numero / 100) % 10;
        int milhar = (numero / 1000) % 10;

        System.out.println("Decompondo o número 1738");
        System.out.println("Unidades: " + unidade);
        System.out.println("Dezenas: " + dezena);
        System.out.println("Centenas: " + centena);
        System.out.println("Milhares: " + milhar);
    }
    
}
