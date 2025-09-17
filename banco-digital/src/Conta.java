/**
 * Classe abstrata que representa uma conta bancária genérica.
 * Demonstra os conceitos de:
 * - Abstração: Define a estrutura comum de todas as contas
 * - Encapsulamento: Atributos privados com métodos públicos de acesso
 * - Herança: Serve como classe base para tipos específicos de conta
 */
public abstract class Conta implements IConta {
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0.0;
    }
    
    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser positivo!");
            return;
        }
        
        if (saldo < valor) {
            System.out.printf("Saldo insuficiente! Saldo atual: R$ %.2f%n", saldo);
            return;
        }
        
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valor);
    }
    
    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito deve ser positivo!");
            return;
        }
        
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso!%n", valor);
    }
    
    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (valor <= 0) {
            System.out.println("Valor de transferência deve ser positivo!");
            return;
        }
        
        if (saldo < valor) {
            System.out.printf("Saldo insuficiente para transferência! Saldo atual: R$ %.2f%n", saldo);
            return;
        }
        
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.printf("Transferência de R$ %.2f realizada com sucesso!%n", valor);
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: R$ %.2f%n", this.saldo);
    }
}
