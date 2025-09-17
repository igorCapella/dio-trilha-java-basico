/**
 * Classe que representa um cliente do banco.
 * Demonstra o conceito de Encapsulamento através de atributos privados
 * e métodos públicos para acessá-los.
 */
public class Cliente {
    
    private String nome;
    private String cpf;
    
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString() {
        return String.format("Cliente: %s (CPF: %s)", nome, cpf);
    }
}
