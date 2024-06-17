package equipamentos.internet;

public class Firefox implements NavegadorDaInternet {
    
    public void exibirPagina() {

        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba() {

        System.out.println("Nova aba");
    }

    public void atualizarPagina() {

        System.out.println("Atualizando página\nPágina atualizada");
    }
}
