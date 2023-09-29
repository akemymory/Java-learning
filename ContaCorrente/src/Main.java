import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nomeCliente = "Akemy Mory";
        String tipoDeConta = "Corrente";
        double saldo = 300.00;
        Scanner valor = new Scanner(System.in);
        while (true) {
            System.out.printf("""
                    ***********************************
                    Dados iniciais do cliente:
                    Nome: %s
                    Tipo de conta: %s
                    Saldo: R$ %.2f
                    ***********************************
                    %n""", nomeCliente, tipoDeConta, saldo);

            System.out.println("""
                    Operações
                    1 - Consultar Saldo
                    2 - Depositar valor
                    3 - Transferir valor
                    4 - Sair
                    
                    Digite a opção desejada:
                    """);

            int opcaoEscolhida = valor.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.println("O seu saldo é: " + saldo);
            } else if (opcaoEscolhida == 2) {
                System.out.println("Digite o valor que deseja depositar:");
                int valorDepositado = valor.nextInt();
                saldo += valorDepositado;
                System.out.println("R$ " + valorDepositado + " Depositados com sucesso, o seu saldo atualizado é " + saldo);
            } else if (opcaoEscolhida == 3) {
                System.out.println("Digite o valor que deseja transferir:");
                double valorDebitado = valor.nextDouble();
                if (valorDebitado > saldo) {
                    System.out.println("Operação não realizada por falta de saldo.");
                } else {
                    saldo -= valorDebitado;
                    System.out.println("Transferência realizada com sucesso, o seu saldo atualizado é " + saldo);
                }
            } else if (opcaoEscolhida == 4) {
                System.out.println("Conte sempre connosco, adeus!");
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}