package equipamentos.musica;

public class Walkman implements ReprodutorMusical {

    public void tocar() {

        System.out.println("Tocando música");
    }

    public void pausar() {

        System.out.println("Música pausada");
    }

    public void selecionarMusica() {

        System.out.println("Selecionando música");
    }
}
