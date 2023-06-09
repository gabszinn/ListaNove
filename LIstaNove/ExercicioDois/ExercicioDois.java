import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioDois {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] produtos = new String[10];
    String[] valorProduto = new String[10];

    for (int i = 0; i < 10; i++) {
        System.out.println("\nInforme o nome do produto " + (i+1) + ": ");
        produtos[i] = scanner.nextLine();
        System.out.println("\nDigite o preço deste produto " + (i+1) + ": ");
        valorProduto[i] = scanner.nextLine();
    }

    try {
      FileWriter arq = new FileWriter("C:\\Users\\AmandaMedeirosdeCarv\\Downloads\\ListaNove\\ExercicioDois\\itens_supermercado.txt");
      PrintWriter gravarArq = new PrintWriter(arq);
   
      for ( int i = 0; i < 10; i++) {
      gravarArq.println("Produto:  " +produtos[i] + "  Preço: R$" + valorProduto[i] + "\n");
      }
      arq.close();
      System.out.println("Os produtos e seus respectivos preços foram salvos no arquivo");

    } catch (Exception e) {
      System.out.println("Não foi possível gravar os dados no arquivo");
    }
    scanner.close();
  }
}