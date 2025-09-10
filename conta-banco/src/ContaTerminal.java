import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Criar um objeto scanner para ler os dados do terminal
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US); 

        //Exibir as mensagens para o nosso usuário e capturar os valores digitados
        System.out.println("Seja bem-vindo ao ByteBank, vamos criar sua conta!");

        System.out.println("Por favor, digite o nome do titular da conta:");
        String nomeTitular = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        //Exibir o resultado no terminal para o usuário
        System.out.println("Olá " + nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
