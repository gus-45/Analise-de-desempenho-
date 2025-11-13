public class ArvoreBinaria {
    private No raiz;
    
    public void inserir(int id) {
        if(this.raiz == null) {
            this.raiz = new No(id);
        } else {
            inserir(id, raiz);
        }
    }
    
    private void inserir(int id, No raiz) {
        if(id == raiz.getId()) {
            return;
        }
        if(id < raiz.getId()) {
            if(raiz.getEsquerda() == null) {
                No novo = new No(id);
                raiz.setEsquerda(novo);
            } else {
                inserir(id, raiz.getEsquerda());
            }
        } else {
            if(raiz.getDireita() == null) {
                No novo = new No(id);
                raiz.setDireita(novo);
            } else {
                inserir(id, raiz.getDireita());
            }
        }
    }
    
    public boolean buscar(int id) {
        if(this.raiz == null) {
            return false;
        } else {
            return buscar(id, raiz);
        }
    }
    
    private boolean buscar(int id, No raiz) {
        if(raiz == null) {
            return false;
        }
        if(id == raiz.getId()) {
            return true;
        }
        if(id < raiz.getId()) {
            return buscar(id, raiz.getEsquerda());
        } else {
            return buscar(id, raiz.getDireita());
        }
    }
}