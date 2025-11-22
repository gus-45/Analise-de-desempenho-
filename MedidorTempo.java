public class MedidorTempo {
    
    public static double medirInsercaoVetor(int[] dados) {
        Vetor vetor = new Vetor(dados.length);
        double inicio = System.nanoTime();
        
        for(int i = 0; i < dados.length; i++) {
            vetor.inserir(dados[i]);
        }
        
        double fim = System.nanoTime();
        return (fim - inicio) / 1000000.0;
    }
    
    public static double medirInsercaoArvoreBinaria(int[] dados) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        double inicio = System.nanoTime();
        
        for(int i = 0; i < dados.length; i++) {
            arvore.inserir(dados[i]);
        }
        
        double fim = System.nanoTime();
        return (fim - inicio) / 1000000.0;
    }
    
    public static double medirInsercaoArvoreAVL(int[] dados) {
        ArvoreAVL arvore = new ArvoreAVL();
        double inicio = System.nanoTime();
        
        for(int i = 0; i < dados.length; i++) {
            arvore.inserir(dados[i]);
        }
        
        double fim = System.nanoTime();
        return (fim - inicio) / 1000000.0;
    }
    
    public static double medirBuscaVetor(Vetor vetor, int valor, boolean usarBinaria) {
        double inicio = System.nanoTime();
        
        if(usarBinaria) {
            vetor.buscaBinaria(valor);
        } else {
            vetor.buscaSequencial(valor);
        }
        
        double fim = System.nanoTime();
        return (fim - inicio) / 1000000.0;
    }
    
    public static double medirBuscaArvoreBinaria(ArvoreBinaria arvore, int valor) {
        double inicio = System.nanoTime();
        arvore.buscar(valor);
        double fim = System.nanoTime();
        return (fim - inicio) / 1000000.0;
    }
    
    public static double medirBuscaArvoreAVL(ArvoreAVL arvore, int valor) {
        double inicio = System.nanoTime();
        arvore.buscar(valor);
        double fim = System.nanoTime();
        return (fim - inicio) / 1000000.0;
    }
    
    public static double medirOrdenacaoBubbleSort(int[] dados) {
        int[] copia = GeradorDados.copiarVetor(dados, dados.length);
        double inicio = System.nanoTime();
        Ordenacao.bubbleSort(copia, copia.length);
        double fim = System.nanoTime();
        return (fim - inicio) / 1000000.0;
    }
    
    public static double medirOrdenacaoMergeSort(int[] dados) {
        int[] copia = GeradorDados.copiarVetor(dados, dados.length);
        double inicio = System.nanoTime();
        Ordenacao.mergeSort(copia, 0, copia.length - 1);
        double fim = System.nanoTime();
        return (fim - inicio) / 1000000.0;
    }
    
    public static double calcularMedia(double[] tempos) {
        double soma = 0;
        for(int i = 0; i < tempos.length; i++) {
            soma = soma + tempos[i];
        }
        return soma / tempos.length;
    }
}