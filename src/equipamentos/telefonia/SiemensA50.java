package equipamentos.telefonia;

public class SiemensA50 implements AparelhoTelefonico {
    
    public void ligar() {

        System.out.println("Ligando");
    }

    public void atender() {

        System.out.println("Telefone tocando");
    }

    public void iniciarCorreioVoz() {

        System.out.println("Chamando correio de voz");
    }
}
