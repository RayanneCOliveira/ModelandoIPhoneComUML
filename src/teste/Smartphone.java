package teste;

import equipamentos.musica.ReprodutorMusical;
import equipamentos.telefonia.AparelhoTelefonico;
import equipamentos.internet.NavegadorDaInternet;
import equipamentos.iphone.IPhone;

public class Smartphone {
    
    public static void main(String[] args) {
        
        ReprodutorMusical iPhone1 = new IPhone();
        NavegadorDaInternet iPhone2 = new IPhone();
        AparelhoTelefonico iPhone3 = new IPhone();

        iPhone1.tocar();
        iPhone1.pausar();
        iPhone1.selecionarMusica();

        iPhone2.adicionarNovaAba();
        iPhone2.exibirPagina();
        iPhone2.atualizarPagina();

        iPhone3.atender();
        iPhone3.ligar();
        iPhone3.iniciarCorreioVoz();
    }
}
