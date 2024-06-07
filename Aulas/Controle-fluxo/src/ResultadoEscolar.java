public class ResultadoEscolar {

    //Condicionais Composta
   
    public static void main(String[] args) {
        
        int nota = 7;
       
        if(nota >= 7)
        System.out.println("Aprovado");

        else
            System.out.println("Reprovado");



        //Condicionais encadeadas
         if(nota >= 7)
            System.out.println("Aprovado");

         else if(nota >= 5 && nota < 7)
            System.out.println("Recuperação");

        else
            System.out.println("Reprovado");


        //Condição ternária
        // Cenário 1
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		    System.out.println(resultado);

        // Cenário 2
        String resultado2 = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		    System.out.println(resultado2);

    }
    
    
}
