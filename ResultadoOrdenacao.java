public class ResultadoOrdenacao {
    private String algoritmo;
    private int tamanho;
    private String ordem;
    private double tempo;
    
    public ResultadoOrdenacao(String algoritmo, int tamanho, String ordem, double tempo) {
        this.algoritmo = algoritmo;
        this.tamanho = tamanho;
        this.ordem = ordem;
        this.tempo = tempo;
    }
    
    public void imprimir() {
        System.out.println("Algoritmo: " + this.algoritmo + 
                         " | Tamanho: " + this.tamanho + 
                         " | Ordem: " + this.ordem + 
                         " | Tempo: " + String.format("%.4f", this.tempo) + " ms");
    }
}