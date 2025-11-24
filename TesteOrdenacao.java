public class TesteOrdenacao {
    private static final int NUMERO_EXECUCOES = 5;
    
    public static void main(String[] args) {
        System.out.println("TESTE DE ORDENACAO");
        System.out.println();
        
        int tamanho = 100;  
        
        System.out.println(">>> Tamanho: " + tamanho + " elementos <<<");
        System.out.println();
        
        
        System.out.println(" DADOS ORDENADOS ");
        int[] dadosOrdenados = GeradorDados.gerarOrdenado(tamanho);
        testarAlgoritmos(dadosOrdenados);
        System.out.println();
       
        System.out.println(" DADOS INVERSOS ");
        int[] dadosInversos = GeradorDados.gerarInverso(tamanho);
        testarAlgoritmos(dadosInversos);
        System.out.println();
        
        
        System.out.println(" DADOS ALEATORIOS ");
        int[] dadosAleatorios = GeradorDados.gerarAleatorio(tamanho);
        testarAlgoritmos(dadosAleatorios);
    }
    
    private static void testarAlgoritmos(int[] dados) {
       
        double[] temposBubble = new double[NUMERO_EXECUCOES];
        for(int i = 0; i < NUMERO_EXECUCOES; i++) {
            temposBubble[i] = MedidorTempo.medirOrdenacaoBubbleSort(dados);
        }
        double mediaBubble = MedidorTempo.calcularMedia(temposBubble);
        System.out.println("BubbleSort: " + String.format("%.2f", mediaBubble) + " ms");
        
       
        double[] temposMerge = new double[NUMERO_EXECUCOES];
        for(int i = 0; i < NUMERO_EXECUCOES; i++) {
            temposMerge[i] = MedidorTempo.medirOrdenacaoMergeSort(dados);
        }
        double mediaMerge = MedidorTempo.calcularMedia(temposMerge);
        System.out.println("MergeSort: " + String.format("%.2f", mediaMerge) + " ms");
    }
}