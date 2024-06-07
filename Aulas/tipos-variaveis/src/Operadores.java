public class Operadores {

    public static void main(String[] args) {
        // concatenação de o sinal de adição em uma variavel do tipo string
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        
        String concatenacao ="?"; 
        // Comportamento concatenação e adição
        concatenacao = 1+1+1+"1";

        concatenacao = 1+"1"+1+1;

        concatenacao = 1+"1"+1+"1";

        concatenacao = "1"+1+1+1;

        concatenacao = "1"+(1+1+1);


        int a, b;

        a = 6;
        b = 6;

        String resultado = (a==b) ? "verdadeiro" : "falso";

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual a numero2?" + simNao);

        boolean simNao = numero1 != numero2;

        System.out.println("numero1 é igual a numero2?" + simNao);
    }

}
