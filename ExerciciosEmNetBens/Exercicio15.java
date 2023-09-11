
package exercicio15;

import java.util.Scanner;


public class Exercicio15 {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        int turmaC, turmaD, totalAlunos;
        double percC, percD, somarepro, percentualDrepro;
        
        System.out.println("A turma D tem 60 alunos.");
        System.out.println("A turma C tem 20 alunos.");
        
        System.out.print("Informe o percentual de alunos reprovados na turma C: ");
        percC = scanner.nextDouble();
        
        System.out.print("Informe o percentual de alunos reprovados na turma D: ");
        percD = scanner.nextDouble();
        
        turmaC = (int)((percC / 100) * 20);
        turmaD = (int)((percD / 100) * 60);
        somarepro = turmaC + turmaD;
        totalAlunos = 20 + 60;
        
        System.out.println("\nNa turma C reprovaram " + turmaC + " alunos.");
        System.out.println("Na turma D reprovaram " + turmaD + " alunos.");
        
        percentualDrepro = (somarepro * 100.0) / totalAlunos;
        System.out.println("\nA porcentagem de alunos reprovados das duas turmas foi de: " + percentualDrepro + "%");
    }
    
}
