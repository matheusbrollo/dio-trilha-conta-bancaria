import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao ByteBank!");
        System.out.println("Siga as instruções para acessar sua conta");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.println();

        System.out.println("Exemplo de agência: 012-3");
        System.out.print("Por favor digite o número da sua agência: ");
        String agencia = scanner.nextLine();
        System.out.println();

        System.out.println("Exemplo de conta: 0001");
        System.out.print("Digite o numero da sua conta: ");
        int numero = scanner.nextInt();
        System.out.println();

        System.out.print("Digite o saldo da sua conta: ");
        double saldo = scanner.nextDouble();
        System.out.println();

        System.out.println("Acesso concedido com sucesso!");

        System.out.println("Olá " + nome + ", obrigado por criar sua conta no ByteBank, sua agência é " + agencia + ", conta "+ numero +" e seu saldo R$" + saldo+ ", já está disponível para saque.");




    }
}