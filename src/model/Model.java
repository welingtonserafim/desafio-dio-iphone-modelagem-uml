package model;
import navegador.Navegador;
import musica.ReprodutorMusical;
import ligacao.Ligacao;

public class Model implements Navegador, ReprodutorMusical, Ligacao {

   // App ligação
    @Override
    public void iniciarAppLigacao() {
        ligar("0119999-5624");
        aceitarLigacao();
        chamadaVoz();
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando: " + numero);
    }

    @Override
    public void aceitarLigacao() {
        System.out.println("Aceitar ligação?");
    }

    @Override
    public void chamadaVoz() {
        System.out.println("Nova mensagem de voz");
    }

    // Reprodutor musical
    @Override
    public void iniciarReprodutor() {
        System.out.println("Iniciando Reprodutor");
        selecionrMusica("In the end");
        tocar();
        pausar();
    }

    @Override
    public void selecionrMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    // App navegador
    @Override
    public void iniciarNavegador() {
        System.out.println("Iniciando Navegador");
        mostrarPAgina("www.google.com.br");
        novaAba();
        atualizaPagina();
    }

    @Override
    public void mostrarPAgina(String url) {
        System.out.println(url);
    }

    @Override
    public void novaAba() {
        System.out.println("Nova aba");
    }

    @Override
    public void atualizaPagina() {
        System.out.println("Atualizando pagina");
    }
}
