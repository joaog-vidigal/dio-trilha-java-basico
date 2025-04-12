public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Música Teste");

        iphone.ligar("1234-5678");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("www.urlteste.com");
        iphone.adicionarPagina();
        iphone.atualizarPagina();

    }
}
