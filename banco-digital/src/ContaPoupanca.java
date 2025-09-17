/**
 * Classe que representa uma Conta Poupança.
 * Demonstra o conceito de Herança, herdando comportamentos da classe Conta
 * e implementando comportamentos específicos de uma conta poupança.
 */
public class ContaPoupanca extends Conta {
    
    private double taxaRendimento;
    
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.taxaRendimento = 0.005; // Taxa de rendimento de 0.5% ao mês
    }
    
    public ContaPoupanca(Cliente cliente, double taxaRendimento) {
        super(cliente);
        this.taxaRendimento = taxaRendimento;
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
        System.out.printf("Taxa de Rendimento: %.3f%% ao mês%n", this.taxaRendimento * 100);
        System.out.println("===============================");
    }
    
    /**
     * Método específico da conta poupança para aplicar rendimento
     */
    public void aplicarRendimento() {
        if (saldo > 0) {
            double rendimento = saldo * taxaRendimento;
            saldo += rendimento;
            System.out.printf("Rendimento aplicado: R$ %.2f | Novo saldo: R$ %.2f%n", rendimento, saldo);
        } else {
            System.out.println("Conta sem saldo para aplicar rendimento.");
        }
    }
    
    /**
     * Sobrescrevendo o método sacar para não permitir saldo negativo em poupança
     */
    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser positivo!");
            return;
        }
        
        if (saldo < valor) {
            System.out.printf("Saldo insuficiente! Conta Poupança não permite saldo negativo. Saldo atual: R$ %.2f%n", saldo);
            return;
        }
        
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado com sucesso na Conta Poupança!%n", valor);
    }
    
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
