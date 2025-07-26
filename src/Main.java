public class Main {
    public static void main(String[] args) {
        Iphone i16 = new Iphone();

        i16.atender();
        i16.ligar("41999999999");
        i16.iniciarCorreioVoz();

        i16.selecionarMusica("Paradise - Coldplay");
        i16.tocar();
        i16.pausar();

        i16.adicionarNovaAba();
        i16.exibirPagina("ge.globo.com");
        i16.atualizarPagina();

    }
}
