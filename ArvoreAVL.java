public class ArvoreAVL {
    private No raiz;
    
    public void inserir(int id) {
        this.raiz = inserir(id, this.raiz);
    }
    
    private No inserir(int id, No raiz) {
        if(raiz == null) {
            return new No(id);
        }
        if(id == raiz.getId()) {
            return raiz;
        }
        if(id < raiz.getId()) {
            raiz.setEsquerda(inserir(id, raiz.getEsquerda()));
        } else {
            raiz.setDireita(inserir(id, raiz.getDireita()));
        }
        
        atualizarAltura(raiz);
        return balancear(raiz);
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
    
    private int obterAltura(No no) {
        if(no == null) {
            return 0;
        }
        return no.getAltura();
    }
    
    private void atualizarAltura(No no) {
        int alturaEsquerda = obterAltura(no.getEsquerda());
        int alturaDireita = obterAltura(no.getDireita());
        if(alturaEsquerda > alturaDireita) {
            no.setAltura(alturaEsquerda + 1);
        } else {
            no.setAltura(alturaDireita + 1);
        }
    }
    
    private int calcularBalanceamento(No no) {
        if(no == null) {
            return 0;
        }
        return obterAltura(no.getDireita()) - obterAltura(no.getEsquerda());
    }
    
    private No balancear(No no) {
        int balanceamento = calcularBalanceamento(no);
        if(balanceamento > 1) {
            if(calcularBalanceamento(no.getDireita()) >= 0) {
                no = rotacaoEsquerda(no);
            } else {
                no.setDireita(rotacaoDireita(no.getDireita()));
                no = rotacaoEsquerda(no);
            }
        } else if(balanceamento < -1) {
            if(calcularBalanceamento(no.getEsquerda()) <= 0) {
                no = rotacaoDireita(no);
            } else {
                no.setEsquerda(rotacaoEsquerda(no.getEsquerda()));
                no = rotacaoDireita(no);
            }
        }
        return no;
    }
    
    private No rotacaoDireita(No x) {
        No y = x.getEsquerda();
        No z = y.getDireita();
        y.setDireita(x);
        x.setEsquerda(z);
        atualizarAltura(x);
        atualizarAltura(y);
        return y;
    }
    
    private No rotacaoEsquerda(No x) {
        No y = x.getDireita();
        No z = y.getEsquerda();
        y.setEsquerda(x);
        x.setDireita(z);
        atualizarAltura(x);
        atualizarAltura(y);
        return y;
    }
}