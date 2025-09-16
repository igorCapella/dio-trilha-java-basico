/**
 * Interface que define as funcionalidades de um aparelho telefônico
 */
public interface AparelhoTelefonico {
    
    /**
     * Realiza uma ligação para o número especificado
     * @param numero Número de telefone para ligar
     */
    void ligar(String numero);
    
    /**
     * Atende uma chamada recebida
     */
    void atender();
    
    /**
     * Inicia o correio de voz
     */
    void iniciarCorreioVoz();
}
