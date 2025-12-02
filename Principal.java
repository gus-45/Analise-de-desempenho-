public class Principal {
    private static final int NUMERO_EXECUCOES = 5;
    private static final int[] TAMANHOS = {100, 1000, 10000};
    
    public static void main(String[] args) {
        System.out.println("ANALISE DE DESEMPENHO DE ESTRUTURAS DE DADOS");
        System.out.println();
        
        for(int i = 0; i < TAMANHOS.length; i++) {
            int tamanho = TAMANHOS[i];
            
            System.out.println(">>> TESTANDO COM " + tamanho + " ELEMENTOS <<<");
            System.out.println();
            
            testarOrdemOrdenada(tamanho);
            testarOrdemInversa(tamanho);
            testarOrdemAleatoria(tamanho);
            
            System.out.println();
        }
        
        System.out.println("TESTES DE ORDENACAO");
        System.out.println();
        
        for(int i = 0; i < TAMANHOS.length; i++) {
            int tamanho = TAMANHOS[i];
            testarOrdenacao(tamanho);
        }
    }
    
    private static void testarOrdemOrdenada(int tamanho) {
        int[] dados = GeradorDados.gerarOrdenado(tamanho);
        testarEstrutura("Vetor", tamanho, "Ordenada", dados);
        testarEstrutura("ArvoreBinaria", tamanho, "Ordenada", dados);
        testarEstrutura("ArvoreAVL", tamanho, "Ordenada", dados);
    }
    
    private static void testarOrdemInversa(int tamanho) {
        int[] dados = GeradorDados.gerarInverso(tamanho);
        testarEstrutura("Vetor", tamanho, "Inversa", dados);
        testarEstrutura("ArvoreBinaria", tamanho, "Inversa", dados);
        testarEstrutura("ArvoreAVL", tamanho, "Inversa", dados);
    }
    
    private static void testarOrdemAleatoria(int tamanho) {
        int[] dados = GeradorDados.gerarAleatorio(tamanho);
        testarEstrutura("Vetor", tamanho, "Aleatoria", dados);
        testarEstrutura("ArvoreBinaria", tamanho, "Aleatoria", dados);
        testarEstrutura("ArvoreAVL", tamanho, "Aleatoria", dados);
    }
    
    private static void testarEstrutura(String tipoEstrutura, int tamanho, String ordem, int[] dados) {
        System.out.println("Estrutura: " + tipoEstrutura);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Ordem: " + ordem);
        
        double[] temposInsercao = new double[NUMERO_EXECUCOES];
        
        for(int i = 0; i < NUMERO_EXECUCOES; i++) {
            if(tipoEstrutura.equals("Vetor")) {
                temposInsercao[i] = MedidorTempo.medirInsercaoVetor(dados);
            } else if(tipoEstrutura.equals("ArvoreBinaria")) {
                temposInsercao[i] = MedidorTempo.medirInsercaoArvoreBinaria(dados);
            } else if(tipoEstrutura.equals("ArvoreAVL")) {
                temposInsercao[i] = MedidorTempo.medirInsercaoArvoreAVL(dados);
            }
        }
        
        double mediaInsercao = MedidorTempo.calcularMedia(temposInsercao);
        System.out.println("Tempo de Insercao: " + String.format("%.4f", mediaInsercao) + " ms");
        
        int primeiro = dados[0];
        int ultimo = dados[dados.length - 1];
        int meio = dados[dados.length / 2];
        int inexistente = tamanho * 10 + 999;
        int aleatorio = dados[tamanho / 3];
        
        if(tipoEstrutura.equals("Vetor")) {
            Vetor vetor = new Vetor(tamanho);
            for(int i = 0; i < dados.length; i++) {
                vetor.inserir(dados[i]);
            }
            
            System.out.println("Busca Primeiro: " + String.format("%.6f", medirBuscaVetorMedia(vetor, primeiro)) + " ms");
            System.out.println("Busca Ultimo: " + String.format("%.6f", medirBuscaVetorMedia(vetor, ultimo)) + " ms");
            System.out.println("Busca Meio: " + String.format("%.6f", medirBuscaVetorMedia(vetor, meio)) + " ms");
            System.out.println("Busca Aleatoria: " + String.format("%.6f", medirBuscaVetorMedia(vetor, aleatorio)) + " ms");
            System.out.println("Busca Inexistente: " + String.format("%.6f", medirBuscaVetorMedia(vetor, inexistente)) + " ms");
            
        } else if(tipoEstrutura.equals("ArvoreBinaria")) {
            ArvoreBinaria arvore = new ArvoreBinaria();
            for(int i = 0; i < dados.length; i++) {
                arvore.inserir(dados[i]);
            }
            
            System.out.println("Busca Primeiro: " + String.format("%.6f", medirBuscaArvoreBinariaMedia(arvore, primeiro)) + " ms");
            System.out.println("Busca Ultimo: " + String.format("%.6f", medirBuscaArvoreBinariaMedia(arvore, ultimo)) + " ms");
            System.out.println("Busca Meio: " + String.format("%.6f", medirBuscaArvoreBinariaMedia(arvore, meio)) + " ms");
            System.out.println("Busca Aleatoria: " + String.format("%.6f", medirBuscaArvoreBinariaMedia(arvore, aleatorio)) + " ms");
            System.out.println("Busca Inexistente: " + String.format("%.6f", medirBuscaArvoreBinariaMedia(arvore, inexistente)) + " ms");
            
        } else if(tipoEstrutura.equals("ArvoreAVL")) {
            ArvoreAVL arvore = new ArvoreAVL();
            for(int i = 0; i < dados.length; i++) {
                arvore.inserir(dados[i]);
            }
            
            System.out.println("Busca Primeiro: " + String.format("%.6f", medirBuscaArvoreAVLMedia(arvore, primeiro)) + " ms");
            System.out.println("Busca Ultimo: " + String.format("%.6f", medirBuscaArvoreAVLMedia(arvore, ultimo)) + " ms");
            System.out.println("Busca Meio: " + String.format("%.6f", medirBuscaArvoreAVLMedia(arvore, meio)) + " ms");
            System.out.println("Busca Aleatoria: " + String.format("%.6f", medirBuscaArvoreAVLMedia(arvore, aleatorio)) + " ms");
            System.out.println("Busca Inexistente: " + String.format("%.6f", medirBuscaArvoreAVLMedia(arvore, inexistente)) + " ms");
        }
        System.out.println();
    }
    
    private static double medirBuscaVetorMedia(Vetor vetor, int valor) {
        double[] tempos = new double[NUMERO_EXECUCOES];
        for(int i = 0; i < NUMERO_EXECUCOES; i++) {
            tempos[i] = MedidorTempo.medirBuscaVetor(vetor, valor, false);
        }
        return MedidorTempo.calcularMedia(tempos);
    }
    
    private static double medirBuscaArvoreBinariaMedia(ArvoreBinaria arvore, int valor) {
        double[] tempos = new double[NUMERO_EXECUCOES];
        for(int i = 0; i < NUMERO_EXECUCOES; i++) {
            tempos[i] = MedidorTempo.medirBuscaArvoreBinaria(arvore, valor);
        }
        return MedidorTempo.calcularMedia(tempos);
    }
    
    private static double medirBuscaArvoreAVLMedia(ArvoreAVL arvore, int valor) {
        double[] tempos = new double[NUMERO_EXECUCOES];
        for(int i = 0; i < NUMERO_EXECUCOES; i++) {
            tempos[i] = MedidorTempo.medirBuscaArvoreAVL(arvore, valor);
        }
        return MedidorTempo.calcularMedia(tempos);
    }
    
    private static void testarOrdenacao(int tamanho) {
        System.out.println(" TESTANDO ORDENACAO COM " + tamanho + " ELEMENTOS ");
        System.out.println();
        
        int[] dadosOrdenados = GeradorDados.gerarOrdenado(tamanho);
        int[] dadosInversos = GeradorDados.gerarInverso(tamanho);
        int[] dadosAleatorios = GeradorDados.gerarAleatorio(tamanho);
        
        testarAlgoritmoOrdenacao("BubbleSort", tamanho, "Ordenada", dadosOrdenados);
        testarAlgoritmoOrdenacao("BubbleSort", tamanho, "Inversa", dadosInversos);
        testarAlgoritmoOrdenacao("BubbleSort", tamanho, "Aleatoria", dadosAleatorios);
        
        System.out.println();
        
        testarAlgoritmoOrdenacao("MergeSort", tamanho, "Ordenada", dadosOrdenados);
        testarAlgoritmoOrdenacao("MergeSort", tamanho, "Inversa", dadosInversos);
        testarAlgoritmoOrdenacao("MergeSort", tamanho, "Aleatoria", dadosAleatorios);
        
        System.out.println();
    }
    
    private static void testarAlgoritmoOrdenacao(String algoritmo, int tamanho, String ordem, int[] dados) {
        double[] tempos = new double[NUMERO_EXECUCOES];
        
        for(int i = 0; i < NUMERO_EXECUCOES; i++) {
            if(algoritmo.equals("BubbleSort")) {
                tempos[i] = MedidorTempo.medirOrdenacaoBubbleSort(dados);
            } else if(algoritmo.equals("MergeSort")) {
                tempos[i] = MedidorTempo.medirOrdenacaoMergeSort(dados);
            }
        }
        
        double media = MedidorTempo.calcularMedia(tempos);
        System.out.println("Algoritmo: " + algoritmo + 
                         " | Tamanho: " + tamanho + 
                         " | Ordem: " + ordem + 
                         " | Tempo: " + String.format("%.4f", media) + " ms");
    }
}