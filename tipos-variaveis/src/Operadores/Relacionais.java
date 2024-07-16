package Operadores;
public class Relacionais {
    public static void main(String[] args) {
        String nomeUm = "WELINGTON";
        String nomeDois = new String("WELINGTON");

        //System.out.println(nomeUm == nomeDois);
        
        System.out.println(nomeUm.equals(nomeDois));        
        
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNão = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println(" a nossa condição e verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNão);

        simNão = numero1 != numero2;
        
        System.out.println("numeroUm é diferente a numeroDois? " + simNão);

        simNão = numero1 > numero2;
        
        System.out.println("numeroUm é maior que numeroDois? " + simNão);

    }
}
