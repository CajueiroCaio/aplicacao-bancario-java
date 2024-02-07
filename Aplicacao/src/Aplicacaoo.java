import java.util.Scanner;

public class Aplicacaoo {
    public static void main(String[] args) {
    double saldoCliente = 2500.00;
    String nome = "Caio Vinícius Cajueiro dos Santos";
    String tipoConta = "Corrente";
    int escolheu = 0;
    Scanner scan = new Scanner(System.in);
    String inicializacao = """
            ***************************************************
            Dados iniciais do cliente:
            
            Nome:           %s
            Tipo de Conta:  %s
            Saldo Inicial:  R$%.2f
            ***************************************************
            
            """.formatted(nome, tipoConta, saldoCliente);
        System.out.println(inicializacao);
        String menu = """
                    
                    
                    Operações:
                    
                    1- Consultar Saldos
                    2- Receber Valor
                    3- Transferir Valor
                    4- Sair
                    
                    Digite a opção desejada: 
                    """;
        while (escolheu != 4) {
            System.out.println(menu);
            escolheu = scan.nextInt();
            switch (escolheu) {
                case 1: {
                    System.out.println(String.format("O seu saldo é de R$%.2f.", saldoCliente));
                    break;
                }
                case 2: {
                    System.out.println("Qual valor deseja receber? ");
                    double adicionaSaldo = scan.nextDouble();
                    saldoCliente += adicionaSaldo;
                    System.out.println(String.format("Seu saldo atualizado é de R$%.2f.", saldoCliente));
                    break;
                }
                case 3: {
                    System.out.println("Qual o valor que deseja transferir? ");
                    double saldoTrasferir = scan.nextDouble();
                    if (saldoTrasferir > saldoCliente) {
                        System.out.println("Seu saldo é insuficiente para realizar a transferência.");
                    } else {
                        saldoCliente -= saldoTrasferir;
                        String mensagemTransf = """
                                Sua transferência foi realizada com sucesso.
                                O saldo restante na sua conta é de R$%.2f.
                                """.formatted(saldoCliente);
                    }
                    break;
                }
                case 4: {
                    System.out.println("Muito obrigado por usar o programa!");
                    break;
                }
                default: {
                    System.out.println("O número digitado não é válido");
                    break;
                }
            }
        }

    }
}