import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioUm {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] nomes = new String[5];
    double[] notasFinais = new double[5];

    for (int i = 0; i < 5; i++) {
        System.out.println("\nInforme o nome do aluno " + (i+1) + ": ");
        nomes[i] = scanner.nextLine();
        System.out.println("\nDigite a nota final do aluno " + (i+1) + ": ");
        notasFinais[i] = scanner.nextDouble();
        scanner.nextLine();
    }

    try {
      FileWriter arq = new FileWriter("C:\\Users\\AmandaMedeirosdeCarv\\Downloads\\ListaNove\\ExercicioUm\\alunos_universidade.txt");
      PrintWriter gravarArq = new PrintWriter(arq);
   
      for ( int i = 0; i < 5; i++) {
      gravarArq.println("Aluno: " + nomes[i] + "  Nota Final: " + notasFinais[i] + "\n");
      }
      arq.close();
      System.out.println("Os alunos foram salvos no arquivo");

    } catch (Exception e) {
      System.out.println("Não foi possível gravar os dados no arquivo");
    }
    scanner.close();
  }
}