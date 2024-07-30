public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    

    
    public void tocar() {
        // Implementação do método tocar()
        System.out.println("Tocando música...");
    }

    
    public void pausar() {
        // Implementação do método pausar()
        System.out.println("Pausando música...");
    }

    
    public void selecionarMusica(String musica) {
        // Implementação do método selecionarMusica()
        System.out.println("Selecionando música: " + musica);
    }

    
    public void ligar(String numero) {
        // Implementação do método ligar()
        System.out.println("Ligando para: " + numero);
    }

    
    public void atender() {
        // Implementação do método atender()
        System.out.println("Atendendo chamada...");
    }

 
    public void iniciarCorreioVoz() {
        // Implementação do método iniciarCorreioVoz()
        System.out.println("Iniciando correio de voz...");
    }

    
    public void exibirPagina(String url) {
        // Implementação do método exibirPagina()
        System.out.println("Exibindo página: " + url);
    }

      public void adicionarNovaAba() {
        // Implementação do método adicionarNovaAba()
        System.out.println("Adicionando nova aba...");
    }

    
    public void atualizarPagina() {
        // Implementação do método atualizarPagina()
        System.out.println("Atualizando página...");
    }
}