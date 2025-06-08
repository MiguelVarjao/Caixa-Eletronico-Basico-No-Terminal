package CaixaEletrotronico;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Conta> contas = new ArrayList<>();
        boolean init = true;
        Scanner in = new Scanner(System.in);
        int tentativas = 0;

        contas.add(new Conta(0, 11111));
        contas.add(new Conta(0, 22222));
        contas.add(new Conta(0, 33333));

        while (init) {

            System.out.println("\n========= CAIXA ELETRONICO =========");
            System.out.println("Digite sua conta: ");
            int numeroConta = in.nextInt();

            Conta contaAtual = null;

            for (Conta c : contas) {

                if(c.getNumeroConta() == numeroConta) {

                    contaAtual = c;
                    break;
                }
            }

            if (tentativas > 3) {

                System.out.println("Numero Maximo de tentaivas");
                System.out.println("Encerrando......");

                System.exit(0);
            }

            if (contaAtual == null) {

                System.out.println("Conta não encontrada");
                tentativas++;

                continue;
            }



            System.out.println("Bem vindo " + contaAtual);
            System.out.println("Escolha um opção ");
            System.out.println("1- Depósito");
            System.out.println("2- Saque");
            System.out.println("3- Ver Saldo");
            System.out.println("4- Sair");
            int opcao = in.nextInt();
            in.nextLine();

            switch (opcao){

                case 1 : {

                    System.out.println("Digite o valor para depósito: ");
                    double valor = in.nextDouble();
                    contaAtual.deposito(valor);
                    in.nextLine();

                    break;
                }
                case 2 : {

                    System.out.println("Digite o valor de saque: ");
                    double valor = in.nextDouble();
                    contaAtual.saque(valor);
                    in.nextLine();

                    break;
                }
                case 3 : {

                    System.out.println("======== Saldo Atual ========");
                    System.out.println("R$" + contaAtual.getSaldo());

                    break;
                }
                case 4 : {

                    System.out.println("Saindo......");
                    init = false;

                    break;
                }
                default :

                    System.out.println("Opçao invalida");
                    break;
            }
        }
    }
}
