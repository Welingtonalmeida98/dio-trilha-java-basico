/*
 * // exemplo 1
 * int nota = 4;

        if (nota >= 7) 
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Prova Recuperação");

        else
            System.out.println("Reprovado");

            // exemplo 2
    int nota = 7;

        String resultado = nota >=7 ? "Aprovado" : "Reprovado";


        System.out.println(resultado);     
           
            
 */


public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 3;

        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";


        System.out.println(resultado);     
           
    }
}
