public class No {
    private int id;
    private No esquerda;
    private No direita;
    private int altura;
    
    public No(int id) {
        this.id = id;
        this.esquerda = null;
        this.direita = null;
        this.altura = 1;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public No getEsquerda() {
        return this.esquerda;
    }
    
    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }
    
    public No getDireita() {
        return this.direita;
    }
    
    public void setDireita(No direita) {
        this.direita = direita;
    }
    
    public int getAltura() {
        return this.altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
}