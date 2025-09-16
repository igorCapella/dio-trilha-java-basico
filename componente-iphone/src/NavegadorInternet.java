/**
 * Interface que define as funcionalidades de um navegador na internet
 */
public interface NavegadorInternet {
    
    /**
     * Exibe uma página web na URL especificada
     * @param url URL da página a ser exibida
     */
    void exibirPagina(String url);
    
    /**
     * Adiciona uma nova aba no navegador
     */
    void adicionarNovaAba();
    
    /**
     * Atualiza a página atual do navegador
     */
    void atualizarPagina();
}
