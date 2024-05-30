import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        double saldo = 237.48;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da agencia");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite o numero da conta");
        String numeroConta = scanner.next();

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenomeCliente = scanner.next();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + "! )Obrigado por criar uma conta em nosso banco, o numero de sua agência é: " + numeroAgencia + " e o numero de sua conta é: " +numeroConta);
        System.out.println("Seu saldo de " +saldo +" já está disponível para saque");
        

    }
}
