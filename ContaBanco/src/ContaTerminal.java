import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        double saldo = 237.48;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da agencia");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da conta");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenomeCliente = scanner.next();

        System.out.println("Olá " +nomeCliente +" " +sobrenomeCliente + "! obrigado por criar uma conta em nosso banco, o numero de sua agência é: "+agencia + " e o numero de sua conta é: "+numero +". Seu saldo de " +saldo +" já está disponível para saque");
        

    }
}
