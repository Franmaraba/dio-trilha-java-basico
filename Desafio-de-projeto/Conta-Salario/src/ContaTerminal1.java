import java.util.Locale;
import java.util.Scanner;

  /*Criei essa segunda forma para inlustra
         * outra maneira de fazer o mesmo projeto
         * com o que aprendi até o momento.
         */

public class ContaTerminal1 {
   public static void main(String[] args) {

      
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite nº da conta");
        int conta = scanner.nextInt();

        System.out.println("Digite sua agencia com digito");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        double saldo = 254.7;

        System.out.println("Olá " + nome + " " + sobrenome + ".");
        System.out.println("Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", Conta " + conta +
        " e seu saldo de " + saldo + " ja está disponivel para saque.");
       

    } 
    
}
