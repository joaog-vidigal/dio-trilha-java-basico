
public class Main {

    public static void main(String[] args) {
        Cliente jonas = new Cliente();
        jonas.setNome("Jonas");

        Conta cc = new ContaCorrente(jonas);
        Conta poupanca = new ContaPoupanca(jonas);

        cc.depositar(200);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();o
    }

}