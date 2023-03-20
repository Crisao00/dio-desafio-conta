import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (//TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            String saldo = "R$237.48";

            //Exibir mensagens ao usuario
            System.out.println("Por favor, digite o numero da sua conta");
            double numero = scanner.nextDouble();

            System.out.println("Por favor, digite o numero da sua agencia");
            String agencia = scanner.next();

            System.out.println("Por favor, digite seu nome");
            String nome = scanner.next();

            //Exibir a mensagem da conta criada
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", Conta: " + numero + ", e seu saldo: " + saldo + ", já está disponível para saque.");
        }
    }
}
