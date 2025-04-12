public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    //Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando " + musica);
    }


    //Aparelho Telefônico

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    //Navegador Internet


    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página de enredeço " + url);
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Página adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}
