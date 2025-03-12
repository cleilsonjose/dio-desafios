import java.util.Scanner;  

public class ContaTerminal {  
    public static void main(String[] args) {  
        // Inicializa o Scanner para leitura de dados do terminal  
        Scanner scanner = new Scanner(System.in);  

        // Declaração de variáveis  
        int numero;  
        String agencia;  
        String nomeCliente;  
        double saldo;  

        // Solicita dados ao usuário  
        System.out.println("Por favor, digite o número da conta:");  
        numero = scanner.nextInt(); // Lê o número da conta  

        agencia = "";  
        boolean agenciaValida = false;  
        // Valida o formato da agência  
        while (!agenciaValida) {  
            System.out.println("Por favor, digite o número da Agência (formato 067-8):");  
            agencia = scanner.next(); // Lê a agência  
            
            // Verifica se a agência está no formato correto  
            if (agencia.matches("\\d{3}-\\d{1}")) {  
                agenciaValida = true;  
            } else {  
                System.out.println("Agência inválida! Por favor, utilize o formato 067-8.");  
            }  
        }  

        System.out.println("Por favor, digite o nome do Cliente:");  
        scanner.nextLine(); // Limpa o buffer  
        nomeCliente = scanner.nextLine(); // Lê o nome do cliente  

        System.out.println("Por favor, digite o saldo:");  
        saldo = scanner.nextDouble(); // Lê o saldo  

        // Exibe a mensagem final com as informações inseridas  
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +  
                          "sua agência é " + agencia + ", conta " + numero +   
                          " e seu saldo " + saldo + " já está disponível para saque.";  

        System.out.println(mensagem);  

        // Fecha o Scanner  
        scanner.close();  
    }  
}  