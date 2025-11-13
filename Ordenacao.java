public class Ordenacao {
    
    public static void bubbleSort(int[] vetor, int tamanho) {
        for(int i = 0; i < tamanho - 1; i++) {
            for(int j = 0; j < tamanho - i - 1; j++) {
                if(vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
    
    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if(inicio < fim) {
            int meio = inicio + (fim - inicio) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }
    
    private static void merge(int[] vetor, int inicio, int meio, int fim) {
        int tamanhoEsquerda = meio - inicio + 1;
        int tamanhoDireita = fim - meio;
        
        int[] esquerda = new int[tamanhoEsquerda];
        int[] direita = new int[tamanhoDireita];
        
        for(int i = 0; i < tamanhoEsquerda; i++) {
            esquerda[i] = vetor[inicio + i];
        }
        for(int j = 0; j < tamanhoDireita; j++) {
            direita[j] = vetor[meio + 1 + j];
        }
        
        int i = 0;
        int j = 0;
        int k = inicio;
        
        while(i < tamanhoEsquerda && j < tamanhoDireita) {
            if(esquerda[i] <= direita[j]) {
                vetor[k] = esquerda[i];
                i++;
            } else {
                vetor[k] = direita[j];
                j++;
            }
            k++;
        }
        
        while(i < tamanhoEsquerda) {
            vetor[k] = esquerda[i];
            i++;
            k++;
        }
        
        while(j < tamanhoDireita) {
            vetor[k] = direita[j];
            j++;
            k++;
        }
    }
}