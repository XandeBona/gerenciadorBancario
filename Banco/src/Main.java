import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listaContas = new ArrayList<>();

        System.out.println("======== CADASTRO DE CONTAS ========");
        System.out.println("1 - Cadastrar uma Conta");
        System.out.println("2 - Realizar um Depósito");
        System.out.println("3 - Realizar um Saque");
        System.out.println("4 - Consultar Saldo");
        System.out.println("5 - Consultar histórico de movimentações");
        System.out.println("6 - Transferir entre contas");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        int escolha = sc.nextInt();

        while (escolha != 0) {
            //Cadastrar nova conta
            if (escolha == 1) {
                System.out.print("Digite o nome do cliente: ");
                sc.nextLine();
                String conta = sc.nextLine();
                listaContas.add(conta);

            } else {
                System.out.println("Faça uma escolha válida!");
            }

            System.out.print("Escolha uma opção: ");
            escolha = sc.nextInt();
        }

        //Finaliza o programa
        System.out.println("Programa encerrado!");

        sc.close();
    }
}