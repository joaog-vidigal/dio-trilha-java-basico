import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o numero da conta:");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("\nDigite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("\nDigite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("\nDigite o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo +
                " já está disponível para saque");

         scanner.close();
    }
}
