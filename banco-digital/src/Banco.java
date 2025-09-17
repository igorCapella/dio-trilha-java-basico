import java.util.List;
import java.util.ArrayList;

/**
 * Classe que representa um banco e gerencia as contas.
 */
public class Banco {
    
    private String nome;
    private List<Conta> contas;
    
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Conta> getContas() {
        return contas;
    }
    
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
    
    public void listarContas() {
        System.out.println("=== Contas do Banco " + nome + " ===");
        for (Conta conta : contas) {
            System.out.printf("Agência: %d | Conta: %d | Titular: %s | Saldo: R$ %.2f%n", 
                conta.getAgencia(), conta.getNumero(), conta.getCliente().getNome(), conta.getSaldo());
        }
        System.out.println();
    }
}
