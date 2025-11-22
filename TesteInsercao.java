public class TesteInsercao {
    private static final int NUMERO_EXECUCOES = 5;
    
    public static void main(String[] args) {
        System.out.println("TESTE DE INSERCAO");
        System.out.println();
        
        int tamanho = 100;  
        
        System.out.println(">>> Tamanho: " + tamanho + " elementos <<<");
        System.out.println();
        
        
        System.out.println(" DADOS ORDENADOS ");
        int[] dadosOrdenados = GeradorDados.gerarOrdenado(tamanho);
        testarInsercao("Vetor", dadosOrdenados);
        testarInsercao("ArvoreBinaria", dadosOrdenados);
        testarInsercao("ArvoreAVL", dadosOrdenados);
        System.out.println();
        
    
        System.out.println(" DADOS INVERSOS ");
        int[] dadosInversos = GeradorDados.gerarInverso(tamanho);
        testarInsercao("Vetor", dadosInversos);
        testarInsercao("ArvoreBinaria", dadosInversos);
        testarInsercao("ArvoreAVL", dadosInversos);
        System.out.println();
        
        System.out.println(" DADOS ALEATORIOS ");
        int[] dadosAleatorios = GeradorDados.gerarAleatorio(tamanho);
        testarInsercao("Vetor", dadosAleatorios);
        testarInsercao("ArvoreBinaria", dadosAleatorios);
        testarInsercao("ArvoreAVL", dadosAleatorios);
    }
    
    private static void testarInsercao(String estrutura, int[] dados) {
        double[] tempos = new double[NUMERO_EXECUCOES];
        
        for(int i = 0; i < NUMERO_EXECUCOES; i++) {
            if(estrutura.equals("Vetor")) {
                tempos[i] = MedidorTempo.medirInsercaoVetor(dados);
            } else if(estrutura.equals("ArvoreBinaria")) {
                tempos[i] = MedidorTempo.medirInsercaoArvoreBinaria(dados);
            } else if(estrutura.equals("ArvoreAVL")) {
                tempos[i] = MedidorTempo.medirInsercaoArvoreAVL(dados);
            }
        }
        
        double media = MedidorTempo.calcularMedia(tempos);
        System.out.println(estrutura + ": " + String.format("%.2f", media) + " ms");
    }
}