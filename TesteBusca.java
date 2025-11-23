public class TesteBusca {
    private static final int NUMERO_EXECUCOES = 5;
    
    public static void main(String[] args) {
        System.out.println("TESTE DE BUSCA");
        System.out.println();
    
        int tamanho = 100;  
        
        String estrutura = "Vetor";
        
        System.out.println(">>> Estrutura: " + estrutura);
        System.out.println(">>> Tamanho: " + tamanho + " elementos <<<");
        System.out.println();
        
        int[] dados = GeradorDados.gerarAleatorio(tamanho);
        
      
        if(estrutura.equals("Vetor")) {
            testarBuscaVetor(dados, tamanho);
        } else if(estrutura.equals("ArvoreBinaria")) {
            testarBuscaArvoreBinaria(dados, tamanho);
        } else if(estrutura.equals("ArvoreAVL")) {
            testarBuscaArvoreAVL(dados, tamanho);
        }
    }
    
    private static void testarBuscaVetor(int[] dados, int tamanho) {
        Vetor vetor = new Vetor(tamanho);
        for(int i = 0; i < dados.length; i++) {
            vetor.inserir(dados[i]);
        }
        
        int primeiro = dados[0];
        int ultimo = dados[dados.length - 1];
        int meio = dados[dados.length / 2];
        int aleatorio = dados[tamanho / 3];
        int inexistente = tamanho * 10 + 999;
        
        System.out.println("Busca Primeiro: " + String.format("%.6f", medirBuscaVetor(vetor, primeiro)) + " ms");
        System.out.println("Busca Ultimo: " + String.format("%.6f", medirBuscaVetor(vetor, ultimo)) + " ms");
        System.out.println("Busca Meio: " + String.format("%.6f", medirBuscaVetor(vetor, meio)) + " ms");
        System.out.println("Busca Aleatoria: " + String.format("%.6f", medirBuscaVetor(vetor, aleatorio)) + " ms");
        System.out.println("Busca Inexistente: " + String.format("%.6f", medirBuscaVetor(vetor, inexistente)) + " ms");
    }
    
    private static void testarBuscaArvoreBinaria(int[] dados, int tamanho) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        for(int i = 0; i < dados.length; i++) {
            arvore.inserir(dados[i]);
        }
        
        int primeiro = dados[0];
        int ultimo = dados[dados.length - 1];
        int meio = dados[dados.length / 2];
        int aleatorio = dados[tamanho / 3];
        int inexistente = tamanho * 10 + 999;
        
        System.out.println("Busca Primeiro: " + String.format("%.6f", medirBuscaArvoreBinaria(arvore, primeiro)) + " ms");
        System.out.println("Busca Ultimo: " + String.format("%.6f", medirBuscaArvoreBinaria(arvore, ultimo)) + " ms");
        System.out.println("Busca Meio: " + String.format("%.6f", medirBuscaArvoreBinaria(arvore, meio)) + " ms");
        System.out.println("Busca Aleatoria: " + String.format("%.6f", medirBuscaArvoreBinaria(arvore, aleatorio)) + " ms");
        System.out.println("Busca Inexistente: " + String.format("%.6f", medirBuscaArvoreBinaria(arvore, inexistente)) + " ms");
    }
    
    private static void testarBuscaArvoreAVL(int[] dados, int tamanho) {
        ArvoreAVL arvore = new ArvoreAVL();
        for(int i = 0; i < dados.length; i++) {
            arvore.inserir(dados[i]);
        }
        
        int primeiro = dados[0];
        int ultimo = dados[dados.length - 1];
        int meio = dados[dados.length / 2];
        int aleatorio = dados[tamanho / 3];
        int inexistente = tamanho * 10 + 999;
        
        System.out.println("Busca Primeiro: " + String.format("%.6f", medirBuscaArvoreAVL(arvore, primeiro)) + " ms");
        System.out.println("Busca Ultimo: " + String.format("%.6f", medirBuscaArvoreAVL(arvore, ultimo)) + " ms");
        System.out.println("Busca Meio: " + String.format("%.6f", medirBuscaArvoreAVL(arvore, meio)) + " ms");
        System.out.println("Busca Aleatoria: " + String.format("%.6f", medirBuscaArvoreAVL(arvore, aleatorio)) + " ms");
        System.out.println("Busca Inexistente: " + String.format("%.6f", medirBuscaArvoreAVL(arvore, inexistente)) + " ms");
    }
    
    private static double medirBuscaVetor(Vetor vetor, int valor) {
        double[] tempos = new double[NUMERO_EXECUCOES];
        for(int i = 0; i < NUMERO_EXECUCOES; i++) {
            tempos[i] = MedidorTempo.medirBuscaVetor(vetor, valor, false);
        }
        return MedidorTempo.calcularMedia(tempos);
    }
    
    private static double medirBuscaArvoreBinaria(ArvoreBinaria arvore, int valor) {
        double[] tempos = new double[NUMERO_EXECUCOES];
        for(int i = 0; i < NUMERO_EXECUCOES; i++) {
            tempos[i] = MedidorTempo.medirBuscaArvoreBinaria(arvore, valor);
        }
        return MedidorTempo.calcularMedia(tempos);
    }
    
    private static double medirBuscaArvoreAVL(ArvoreAVL arvore, int valor) {
        double[] tempos = new double[NUMERO_EXECUCOES];
        for(int i = 0; i < NUMERO_EXECUCOES; i++) {
            tempos[i] = MedidorTempo.medirBuscaArvoreAVL(arvore, valor);
        }
        return MedidorTempo.calcularMedia(tempos);
    }
}