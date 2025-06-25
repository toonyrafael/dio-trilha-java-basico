import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        //TODO: Conhecer e Importar a classe scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pelo scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, Td bem?, Vamos criar a sua conta do banco Peço que forneça as informações a seguir");
        System.out.println("Digite o numero da sua Conta");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Ótimo, Agora digite o numero da sua Agencia");
        String agencia = scanner.nextLine();

        System.out.println("Certo, Agora digite o nome do Cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Para Finalizar, digite o valor que Deseja Depositar");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " .concat(nomeCliente) + ", Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " Já está disponível para saque.");


    }
}
