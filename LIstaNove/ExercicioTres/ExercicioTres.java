import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;

public class ExercicioTres {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random aleatorio = new Random();

    String nome, cpf;
    int idade, destino, numeroAleatorio;

    System.out.println("Digite seu nome: ");
    nome = scanner.nextLine();
    System.out.println("Digite seu cpf: ");
    cpf = scanner.nextLine();
    System.out.println("Digite sua idade: ");
    idade = scanner.nextInt();

    System.out.println("\nEscolha seu Destino: \n[1]São Paulo - $250,00 \n[2]Nova York - $2400,00 \n[3]Berlim - $3800,00");
    destino = scanner.nextInt();

    numeroAleatorio = aleatorio.nextInt(01,21);

    switch(destino) {
        case 1:
        System.out.println("Recibo de viagem\nNome: "+nome+"\nIdade: "+idade+"\nCPF: "+cpf+"\nDestino: São Paulo\nValor a pagar: $250,00\nPoltrona: "+numeroAleatorio);
        break;
        case 2:
        System.out.println("Recibo de viagem\nNome: "+nome+"\nIdade: "+idade+"\nCPF: "+cpf+"\nDestino: Nova York\nValor a pagar: $2400,00\nPoltrona :"+numeroAleatorio);
        break;
        case 3:
        System.out.println("Recibo de viagem\nNome: "+nome+"\nIdade: "+idade+"\nCPF: "+cpf+"\nDestino: Berlim\nValor a pagar: $3800,00\nPoltrona :"+numeroAleatorio);
        break;
        default:
        break;
    }

    try {
      FileWriter arq = new FileWriter("C:\\Users\\AmandaMedeirosdeCarv\\Downloads\\ListaNove\\ExercicioTres\\recibo_viagem.txt");
      PrintWriter gravarArq = new PrintWriter(arq);
   
      if (destino == 1) {
      gravarArq.println("Recibo de viagem\nNome: "+nome+"\nIdade: "+idade+"\nCPF: "+cpf+"\nDestino: São Paulo\nValor a pagar: $250,00\nPoltrona: "+numeroAleatorio);
      }
      else if (destino == 2) {
        gravarArq.println("Recibo de viagem\nNome: "+nome+"\nIdade: "+idade+"\nCPF: "+cpf+"\nDestino: Nova York\nValor a pagar: $2400,00\nPoltrona: "+numeroAleatorio);
      }
      else {
        gravarArq.println("Recibo de viagem\nNome: "+nome+"\nIdade: "+idade+"\nCPF: "+cpf+"\nDestino: Berlim\nValor a pagar: $3800,00\nPoltrona: "+numeroAleatorio);
      }
      arq.close();
      System.out.println("O recibo foi salvo no arquivo");

    } catch (Exception e) {
      System.out.println("Não foi possível gravar os dados no arquivo");
    }
    scanner.close();
  }
}
