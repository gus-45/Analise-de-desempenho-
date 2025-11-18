public class ResultadoTeste {
    private String estrutura;
    private int tamanho;
    private String ordem;
    private double tempoInsercao;
    private double tempoBuscaPrimeiro;
    private double tempoBuscaUltimo;
    private double tempoBuscaMeio;
    private double tempoBuscaAleatorio;
    private double tempoBuscaInexistente;
    
    public ResultadoTeste(String estrutura, int tamanho, String ordem) {
        this.estrutura = estrutura;
        this.tamanho = tamanho;
        this.ordem = ordem;
    }
    
    public void setTempoInsercao(double tempo) {
        this.tempoInsercao = tempo;
    }
    
    public void setTempoBuscaPrimeiro(double tempo) {
        this.tempoBuscaPrimeiro = tempo;
    }
    
    public void setTempoBuscaUltimo(double tempo) {
        this.tempoBuscaUltimo = tempo;
    }
    
    public void setTempoBuscaMeio(double tempo) {
        this.tempoBuscaMeio = tempo;
    }
    
    public void setTempoBuscaAleatorio(double tempo) {
        this.tempoBuscaAleatorio = tempo;
    }
    
    public void setTempoBuscaInexistente(double tempo) {
        this.tempoBuscaInexistente = tempo;
    }
    
    public void imprimir() {
        System.out.println("Estrutura: " + this.estrutura);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Ordem: " + this.ordem);
        System.out.println("\n");
        System.out.println("Tempo de Insercao: " + String.format("%.4f", this.tempoInsercao) + " ms");
        System.out.println("Busca Primeiro: " + String.format("%.6f", this.tempoBuscaPrimeiro) + " ms");
        System.out.println("Busca Ultimo: " + String.format("%.6f", this.tempoBuscaUltimo) + " ms");
        System.out.println("Busca Meio: " + String.format("%.6f", this.tempoBuscaMeio) + " ms");
        System.out.println("Busca Aleatoria: " + String.format("%.6f", this.tempoBuscaAleatorio) + " ms");
        System.out.println("Busca Inexistente: " + String.format("%.6f", this.tempoBuscaInexistente) + " ms");
        System.out.println("\n");
        System.out.println();
    }
}
