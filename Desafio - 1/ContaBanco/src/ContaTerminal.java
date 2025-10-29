import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo!");
        scanner.useLocale(Locale.US);
        float saldo = scanner.nextFloat();

        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeCliente, agencia, numero, saldo);

    }
}
