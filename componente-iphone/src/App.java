/**
 * Classe principal para demonstrar as funcionalidades do iPhone
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== DEMONSTRAÇÃO DO iPHONE ===\n");
        
        // Criando uma instância do iPhone
        iPhone meuIphone = new iPhone();
        
        // Demonstrando funcionalidades do Reprodutor Musical
        System.out.println("=== REPRODUTOR MUSICAL ===");
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();
        System.out.println();
        
        // Demonstrando funcionalidades do Aparelho Telefônico
        System.out.println("=== APARELHO TELEFÔNICO ===");
        meuIphone.ligar("(11) 99999-9999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        System.out.println();
        
        // Demonstrando funcionalidades do Navegador Internet
        System.out.println("=== NAVEGADOR INTERNET ===");
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.atualizarPagina();
        System.out.println();
        
        System.out.println("Demonstração concluída!");
    }
}
