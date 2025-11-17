public class GeradorDados {
    
    public static int[] gerarOrdenado(int tamanho) {
        int[] dados = new int[tamanho];
        for(int i = 0; i < tamanho; i++) {
            dados[i] = i + 1;
        }
        return dados;
    }
    
    public static int[] gerarInverso(int tamanho) {
        int[] dados = new int[tamanho];
        for(int i = 0; i < tamanho; i++) {
            dados[i] = tamanho - i;
        }
        return dados;
    }
    
    public static int[] gerarAleatorio(int tamanho) {
        int[] dados = new int[tamanho];
        int semente = (int)(System.currentTimeMillis() % 100000);
        
        for(int i = 0; i < tamanho; i++) {
            semente = (semente * 1103 + 12345) % 2147483647;
            if(semente < 0) {
                semente = semente * -1;
            }
            dados[i] = (semente % (tamanho * 10)) + 1;
        }
        return dados;
    }
    
    public static int[] copiarVetor(int[] original, int tamanho) {
        int[] copia = new int[tamanho];
        for(int i = 0; i < tamanho; i++) {
            copia[i] = original[i];
        }
        return copia;
    }
}