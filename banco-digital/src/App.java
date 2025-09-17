/**
 * Classe principal que demonstra o uso do sistema bancário
 * e todos os conceitos de Programação Orientada a Objetos:
 * - Abstração (Interface IConta e classe abstrata Conta)
 * - Encapsulamento (Atributos privados e métodos públicos)
 * - Herança (ContaCorrente e ContaPoupanca herdam de Conta)
 * - Polimorfismo (Tratamento de objetos através da interface IConta)
 */
public class App {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BANCÁRIO DIGITAL ===\n");
        
        // Criando o banco
        Banco banco = new Banco("Banco DIO");
        
        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-01");
        Cliente cliente2 = new Cliente("Maria Santos", "987.654.321-02");
        Cliente cliente3 = new Cliente("Pedro Oliveira", "456.789.123-03");
        
        System.out.println("=== CRIANDO CLIENTES ===");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println();
        
        // Criando contas - Demonstrando HERANÇA
        ContaCorrente contaCorrenteJoao = new ContaCorrente(cliente1, 1000.0);
        ContaPoupanca contaPoupancaJoao = new ContaPoupanca(cliente1);
        ContaCorrente contaCorrenteMaria = new ContaCorrente(cliente2);
        ContaPoupanca contaPoupancaPedro = new ContaPoupanca(cliente3);
        
        // Adicionando contas ao banco
        banco.adicionarConta(contaCorrenteJoao);
        banco.adicionarConta(contaPoupancaJoao);
        banco.adicionarConta(contaCorrenteMaria);
        banco.adicionarConta(contaPoupancaPedro);
        
        System.out.println("=== CONTAS CRIADAS ===");
        banco.listarContas();
        
        // Demonstrando POLIMORFISMO - usando a interface IConta
        System.out.println("=== DEMONSTRANDO POLIMORFISMO ===");
        IConta[] contas = {contaCorrenteJoao, contaPoupancaJoao, contaCorrenteMaria, contaPoupancaPedro};
        
        // Fazendo depósitos iniciais em todas as contas
        double[] depositos = {1500.0, 2000.0, 800.0, 1200.0};
        for (int i = 0; i < contas.length; i++) {
            contas[i].depositar(depositos[i]);
        }
        System.out.println();
        
        // Exibindo extratos iniciais
        System.out.println("=== EXTRATOS APÓS DEPÓSITOS INICIAIS ===");
        contaCorrenteJoao.imprimirExtrato();
        contaPoupancaJoao.imprimirExtrato();
        contaCorrenteMaria.imprimirExtrato();
        contaPoupancaPedro.imprimirExtrato();
        
        // Demonstrando operações específicas
        System.out.println("=== OPERAÇÕES BANCÁRIAS ===");
        
        // João faz um saque na conta corrente
        System.out.println("João sacando R$ 200,00 da conta corrente:");
        contaCorrenteJoao.sacar(200.0);
        System.out.println();
        
        // Maria tenta sacar mais do que tem (vai usar o cheque especial)
        System.out.println("Maria tentando sacar R$ 1000,00 da conta corrente (saldo: R$ 800,00):");
        contaCorrenteMaria.sacar(1000.0);
        System.out.println();
        
        // Pedro tenta sacar mais do que tem na poupança (não deve permitir)
        System.out.println("Pedro tentando sacar R$ 1500,00 da conta poupança (saldo: R$ 1200,00):");
        contaPoupancaPedro.sacar(1500.0);
        System.out.println();
        
        // João transferindo da conta corrente para a poupança
        System.out.println("João transferindo R$ 500,00 da conta corrente para a poupança:");
        contaCorrenteJoao.transferir(500.0, contaPoupancaJoao);
        System.out.println();
        
        // João transferindo para a conta da Maria
        System.out.println("João transferindo R$ 300,00 para a conta corrente da Maria:");
        contaCorrenteJoao.transferir(300.0, contaCorrenteMaria);
        System.out.println();
        
        // Aplicando rendimento na conta poupança do João
        System.out.println("Aplicando rendimento na conta poupança do João:");
        contaPoupancaJoao.aplicarRendimento();
        System.out.println();
        
        // Aplicando rendimento na conta poupança do Pedro
        System.out.println("Aplicando rendimento na conta poupança do Pedro:");
        contaPoupancaPedro.aplicarRendimento();
        System.out.println();
        
        // Extratos finais
        System.out.println("=== EXTRATOS FINAIS ===");
        contaCorrenteJoao.imprimirExtrato();
        contaPoupancaJoao.imprimirExtrato();
        contaCorrenteMaria.imprimirExtrato();
        contaPoupancaPedro.imprimirExtrato();
        
        // Listagem final de todas as contas
        System.out.println("=== RESUMO FINAL DO BANCO ===");
        banco.listarContas();
        
        // Demonstrando POLIMORFISMO com método que aceita qualquer IConta
        System.out.println("=== DEMONSTRAÇÃO ADICIONAL DE POLIMORFISMO ===");
        realizarOperacaoGenerica(contaCorrenteJoao, "Conta Corrente do João");
        realizarOperacaoGenerica(contaPoupancaJoao, "Conta Poupança do João");
        realizarOperacaoGenerica(contaCorrenteMaria, "Conta Corrente da Maria");
        realizarOperacaoGenerica(contaPoupancaPedro, "Conta Poupança do Pedro");
    }
    
    /**
     * Método que demonstra POLIMORFISMO
     * Aceita qualquer objeto que implemente IConta
     */
    private static void realizarOperacaoGenerica(IConta conta, String descricao) {
        System.out.println("Operação genérica em: " + descricao);
        conta.depositar(50.0);
        conta.imprimirExtrato();
    }
}
