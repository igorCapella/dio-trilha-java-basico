/**
 * Interface que define as funcionalidades de um reprodutor musical
 */
public interface ReprodutorMusical {
    
    /**
     * Inicia a reprodução da música atual
     */
    void tocar();
    
    /**
     * Pausa a reprodução da música atual
     */
    void pausar();
    
    /**
     * Seleciona uma música específica para reproduzir
     * @param musica Nome da música a ser selecionada
     */
    void selecionarMusica(String musica);
}
