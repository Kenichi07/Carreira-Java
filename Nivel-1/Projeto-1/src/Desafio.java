import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio {
  public static void main(String[] args) {
    String nome = "Miyuki";
    String tipoConta = "Corrente";
    double saldo = 2500;
    int opcao = 0;
    double valor = 0;

    System.out.println("*******************************");
    System.out.println("\nNome do cliente: " + nome);
    System.out.println("Tipo da conta: " + tipoConta);
    System.out.println("Saldo da conta: " + saldo);
    System.out.println("\n******************************");

    String menu = """
                **    Operações     **
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair
                """;

    Scanner leitura = new Scanner(System.in);
    while (opcao != 4) {
      System.out.println(menu);
      opcao = leitura.nextInt();

//      if (opcao == 1) {
//        System.out.println("O saldo atualizado é: " + saldo);
//      } else if (opcao == 2) {
//        System.out.println("Qual o valor que deseja transferir?");
//        double valor = leitura.nextDouble();
//        if (valor > saldo) {
//          System.out.println("Não há saldo para realizar a transferência.");
//        } else {
//          saldo -= valor;
//          System.out.println("Novo saldo é: " + saldo);
//        }
//      } else if (opcao == 3) {
//        System.out.println("Valor recebido: ");
//        double valor = leitura.nextDouble();
//        saldo += valor;
//        System.out.println("Novo saldo: " + saldo);
//      } else if (opcao != 4) {
//        System.out.println("Opção inválida!");
//      }

      switch (opcao) {
        case 1:
          System.out.println("O saldo atualizado é: " + saldo);
          break;
        case 2:
          System.out.println("Qual o valor que deseja transferir?");
          valor = leitura.nextDouble();
          if (valor > saldo) {
            System.out.println("Não há saldo para realizar a transferência.");
          } else {
            saldo -= valor;
            System.out.println("Novo saldo é: " + saldo);
          }
          break;
        case 3:
          System.out.println("Valor recebido: ");
          valor = leitura.nextDouble();
          saldo += valor;
          System.out.println("Novo saldo: " + saldo);
          break;
        case 4:
          break;
        default:
          System.out.println("Opção inválida!");

      }
    }

  }
}
