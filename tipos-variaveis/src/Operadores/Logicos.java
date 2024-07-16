package Operadores;
public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;

        boolean condicao2 = true;

        if (condicao1 && (7>4) ) {
            System.err.println("as duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.err.println("Uma das condições é verdadeira");
        }

        System.err.println("fim");

    }
}
