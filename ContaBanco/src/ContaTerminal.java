import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Agora digite a Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
            int numeroConta = scanner.nextInt();

        System.out.println("Digite o seu nome!");
            String nome = scanner.next();
            
        System.out.println("Digite o seu sobrenome!");
            String sobrenome = scanner.next();
        
        System.out.println("Digite o seu saldo!");
            double saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+" "+sobrenome+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numeroConta+" e seu saldo "+saldo+ " já está disponível para saque." );

    }
}
