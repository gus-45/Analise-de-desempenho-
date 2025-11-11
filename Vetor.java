public class Vetor {
    private int[] elementos;
    private int tamanho;
    
    public Vetor(int capacidade) {
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }
    
    public void inserir(int valor) {
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = valor;
            this.tamanho++;
        }
    }
    
    public boolean buscaSequencial(int valor) {
        for(int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i] == valor) {
                return true;
            }
        }
        return false;
    }
    
    public boolean buscaBinaria(int valor) {
        int esquerda = 0;
        int direita = this.tamanho - 1;
        
        while(esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            
            if(this.elementos[meio] == valor) {
                return true;
            }
            
            if(this.elementos[meio] < valor) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return false;
    }
    
    public int[] getElementos() {
        return this.elementos;
    }
    
    public int getTamanho() {
        return this.tamanho;
    }
    
    public int obterElemento(int indice) {
        if(indice >= 0 && indice < this.tamanho) {
            return this.elementos[indice];
        }
        return -1;
    }
}