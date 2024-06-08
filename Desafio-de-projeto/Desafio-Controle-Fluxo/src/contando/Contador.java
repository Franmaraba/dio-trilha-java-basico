package contando;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite um numero");
        int parametroDois = scanner.nextInt();

        try {
            
            contar(parametroUm, parametroDois);
            

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) 
        throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        System.out.println("Tivemos " + contagem + " ocorrencias para impressão");
        
        for(int x = 1; x <= contagem; x++){
            System.out.println("Imprimindo nº" + x);
        }
    }
    

}