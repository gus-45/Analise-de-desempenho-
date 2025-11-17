public class MedidorTempo {
    
    public static int medirInsercaoVetor(int[] dados) {
        Vetor vetor = new Vetor(dados.length);
        int inicio = (int)System.currentTimeMillis();
        
        for(int i = 0; i < dados.length; i++) {
            vetor.inserir(dados[i]);
        }
        
        int fim = (int)System.currentTimeMillis();
        return fim - inicio;
    }
    
    public static int medirInsercaoArvoreBinaria(int[] dados) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        int inicio = (int)System.currentTimeMillis();
        
        for(int i = 0; i < dados.length; i++) {
            arvore.inserir(dados[i]);
        }
        
        int fim = (int)System.currentTimeMillis();
        return fim - inicio;
    }
    
    public static int medirInsercaoArvoreAVL(int[] dados) {
        ArvoreAVL arvore = new ArvoreAVL();
        int inicio = (int)System.currentTimeMillis();
        
        for(int i = 0; i < dados.length; i++) {
            arvore.inserir(dados[i]);
        }
        
        int fim = (int)System.currentTimeMillis();
        return fim - inicio;
    }
    
    public static int medirBuscaVetor(Vetor vetor, int valor, boolean usarBinaria) {
        int inicio = (int)System.currentTimeMillis();
        
        if(usarBinaria) {
            vetor.buscaBinaria(valor);
        } else {
            vetor.buscaSequencial(valor);
        }
        
        int fim = (int)System.currentTimeMillis();
        return fim - inicio;
    }
    
    public static int medirBuscaArvoreBinaria(ArvoreBinaria arvore, int valor) {
        int inicio = (int)System.currentTimeMillis();
        arvore.buscar(valor);
        int fim = (int)System.currentTimeMillis();
        return fim - inicio;
    }
    
    public static int medirBuscaArvoreAVL(ArvoreAVL arvore, int valor) {
        int inicio = (int)System.currentTimeMillis();
        arvore.buscar(valor);
        int fim = (int)System.currentTimeMillis();
        return fim - inicio;
    }
    
    public static int medirOrdenacaoBubbleSort(int[] dados) {
        int[] copia = GeradorDados.copiarVetor(dados, dados.length);
        int inicio = (int)System.currentTimeMillis();
        Ordenacao.bubbleSort(copia, copia.length);
        int fim = (int)System.currentTimeMillis();
        return fim - inicio;
    }
    
    public static int medirOrdenacaoMergeSort(int[] dados) {
        int[] copia = GeradorDados.copiarVetor(dados, dados.length);
        int inicio = (int)System.currentTimeMillis();
        Ordenacao.mergeSort(copia, 0, copia.length - 1);
        int fim = (int)System.currentTimeMillis();
        return fim - inicio;
    }
    
    public static double calcularMedia(int[] tempos) {
        int soma = 0;
        for(int i = 0; i < tempos.length; i++) {
            soma = soma + tempos[i];
        }
        return (double)soma / tempos.length;
    }
}