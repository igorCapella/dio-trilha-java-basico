/**
 * Interface que define as operações básicas de uma conta bancária.
 * Demonstra o conceito de Abstração, definindo apenas os métodos essenciais
 * sem se preocupar com a implementação específica.
 */
public interface IConta {
    
    /**
     * Realiza um saque na conta
     * @param valor valor a ser sacado
     */
    void sacar(double valor);
    
    /**
     * Realiza um depósito na conta
     * @param valor valor a ser depositado
     */
    void depositar(double valor);
    
    /**
     * Transfere um valor desta conta para outra conta
     * @param valor valor a ser transferido
     * @param contaDestino conta que receberá o valor
     */
    void transferir(double valor, IConta contaDestino);
    
    /**
     * Imprime o extrato da conta
     */
    void imprimirExtrato();
}
