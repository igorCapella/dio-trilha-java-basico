/**
 * Classe que representa uma Conta Corrente.
 * Demonstra o conceito de Herança, herdando comportamentos da classe Conta
 * e implementando comportamentos específicos de uma conta corrente.
 */
public class ContaCorrente extends Conta {
    
    private double limiteChequeEspecial;
    
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.limiteChequeEspecial = 500.0; // Limite padrão de R$ 500,00
    }
    
    public ContaCorrente(Cliente cliente, double limiteChequeEspecial) {
        super(cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    
    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser positivo!");
            return;
        }
        
        double saldoDisponivel = saldo + limiteChequeEspecial;
        
        if (saldoDisponivel < valor) {
            System.out.printf("Limite insuficiente! Saldo + Limite: R$ %.2f%n", saldoDisponivel);
            return;
        }
        
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado com sucesso na Conta Corrente!%n", valor);
        
        if (saldo < 0) {
            System.out.printf("Você está utilizando R$ %.2f do seu cheque especial.%n", Math.abs(saldo));
        }
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        System.out.printf("Limite Cheque Especial: R$ %.2f%n", this.limiteChequeEspecial);
        System.out.printf("Saldo Disponível: R$ %.2f%n", this.saldo + this.limiteChequeEspecial);
        System.out.println("===============================");
    }
    
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
    
    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    
    public double getSaldoDisponivel() {
        return saldo + limiteChequeEspecial;
    }
}
