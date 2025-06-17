import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Delilah Bard";
        String conta = "Conta corrente";
        double saldo = 3500.00;
        int opcao = 0;
        String dados = """
                ***********************
                Nome: %s
                Conta: %s
                Saldo inicial: %.2f
                ***********************
                """.formatted(nome, conta, saldo);
        System.out.println(dados);

        while (opcao != 4){
            String operacoes = """
                
                Operações:
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:""";
            System.out.println(operacoes);

            opcao = leitura.nextInt();
            if(opcao==1){
                System.out.println("O saldo atual é: "+saldo);
            }

            else if(opcao==2){
                System.out.println("Digite o valor que será recebido: ");
                double receber = leitura.nextDouble();
                saldo += receber;
                System.out.println("O saldo atual é: "+saldo);
            }

            else if(opcao==3){
                System.out.println("Digite o valor que será transferido: ");
                double transferir = leitura.nextDouble();

                while(transferir > saldo){
                    System.out.println("Seu saldo é insuficiente, digite outro valor ");
                    transferir = leitura.nextDouble();
                }
                if(transferir <= saldo) {
                    saldo -= transferir;
                    System.out.println("O saldo atual é: " + saldo);
                }
            }

            else if(opcao==4){
                System.out.println("Você saiu da operação.");
            }

            else{
                System.out.println("Não há esse número nas opções oferecidas.");
            }
        }
    }
}
