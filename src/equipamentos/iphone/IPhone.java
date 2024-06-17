package equipamentos.iphone;

import equipamentos.internet.NavegadorDaInternet;
import equipamentos.musica.ReprodutorMusical;
import equipamentos.telefonia.AparelhoTelefonico;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDaInternet {

    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    public void ligar() {
        System.out.println("Chamando");
    }

    public void atender() {
        System.out.println("Celular tocando\nAtender ou recusar?");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Chamando correio de voz");
    }
}
