/*
 * Exemplo 1
 *    String sigla = "M";

        if(sigla == "P")
        System.out.println("PEQUENO");

        else if(sigla == "M")
        System.out.println("MEDIO");

        else if(sigla == "G")
        System.out.println("GRANDE");

        else
        System.out.println("INDEFINIDO");

        if(plano == "B") {
        System.out.println("100 minutos de ligação");

    } else if(plano == "M") {
        System.out.println("100 minutos de ligação");
        System.out.println("Whats e Instagram grátis");


    } else if(plano == "T") {
        System.out.println("100 minutos de ligação");
        System.out.println("Whats e Instagram grátis");
        System.out.println("5Gb Youtube");
 */


public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "G";

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");                
                break;
            }
            case "M":{
                System.out.println("MEDIO");                
                break;
            }
            case "G":{
                System.out.println("GRANDE");                
                break;
            }
            
            default:
            System.out.println("INDEFINIDO");
        }
    }
                
     
}
