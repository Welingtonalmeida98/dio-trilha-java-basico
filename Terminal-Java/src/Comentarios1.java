public class Comentarios1 {
    public static void main(String[] args) {
        
    }
    /*
     * Este método foi elaborado as pressas
     * por isso eu abreviei o nome das variáveis
     * mais olha, ele tem a finalidade somar ou multiplicar
     * dois números.
     */
    public int somaMultiplica (int n, int x, String m) {
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M = multiplicação
            r = n * x;
        }else {
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }
}
