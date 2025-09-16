/**
 * Classe que representa o iPhone e implementa todas as suas funcionalidades
 * Combina as funcionalidades de reprodutor musical, aparelho telefônico e navegador internet
 */
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    private String musicaAtual;
    private boolean tocando;
    private String paginaAtual;
    private int numeroAbas;
    
    public iPhone() {
        this.musicaAtual = "";
        this.tocando = false;
        this.paginaAtual = "";
        this.numeroAbas = 1;
    }
    
    // Implementação dos métodos do ReprodutorMusical
    @Override
    public void tocar() {
        if (!musicaAtual.isEmpty()) {
            tocando = true;
            System.out.println("Reproduzindo: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada");
        }
    }
    
    @Override
    public void pausar() {
        if (tocando) {
            tocando = false;
            System.out.println("Música pausada: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música está tocando");
        }
    }
    
    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }
    
    // Implementação dos métodos do AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
        System.out.println("Chamada em andamento...");
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
        System.out.println("Chamada atendida");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
        System.out.println("Gravação de mensagem disponível");
    }
    
    // Implementação dos métodos do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Exibindo página: " + url);
        System.out.println("Página carregada com sucesso");
    }
    
    @Override
    public void adicionarNovaAba() {
        numeroAbas++;
        System.out.println("Nova aba adicionada");
        System.out.println("Total de abas: " + numeroAbas);
    }
    
    @Override
    public void atualizarPagina() {
        if (!paginaAtual.isEmpty()) {
            System.out.println("Atualizando página: " + paginaAtual);
            System.out.println("Página atualizada");
        } else {
            System.out.println("Nenhuma página carregada");
        }
    }
    
    // Métodos auxiliares para obter informações do estado atual
    public String getMusicaAtual() {
        return musicaAtual;
    }
    
    public boolean isTocando() {
        return tocando;
    }
    
    public String getPaginaAtual() {
        return paginaAtual;
    }
    
    public int getNumeroAbas() {
        return numeroAbas;
    }
}
