📊 Análise de Desempenho de Estruturas de Dados em Java
Este projeto implementa e compara o desempenho de diferentes estruturas de dados e algoritmos de ordenação em Java. Testes medem tempos de inserção, busca e ordenação em cenários variados.

📁 Estrutura do Projeto

* **`analisededesempenho/`**
    * **`No.java`**
    * **`Vetor.java`**
    * **`ArvoreBinaria.java`**
    * **`ArvoreAVL.java`**
    * **`Ordenacao.java`**
    * **`GeradorDados.java`**
    * **`MedidorTempo.java`**
    * **`Principal.java`**
    * **`TesteInsercao.java`**  # executar apenas inserção
    * **`TesteBusca.java`**     # executar apenas busca
    * **`TesteOrdenacao.java`** # executar apenas ordenação

📌 Descrição dos Arquivos
No.java
Classe que representa um nó usado nas árvores binárias (contém chave, referências para filhos, e campos auxiliares quando necessário).

Vetor.java
Implementação de um vetor/array dinâmico (ou estático, conforme sua implementação) com:

inserção
busca sequencial
busca binária (requer vetor ordenado para uso correto)
ArvoreBinaria.java
Implementação de Árvore Binária de Busca (BST) com operações:

inserir
buscar
travessias (in-order por exemplo)
remoção (opcional)
ArvoreAVL.java
Implementação de Árvore AVL (BST auto-balanceada) com:

inserção com rotações (simples e duplas)
busca
cálculo/atualização de alturas
balanceamento automático
Ordenacao.java
Implementações dos algoritmos de ordenação:

BubbleSort
MergeSort
GeradorDados.java
Gera conjuntos de dados nos três estados:

ordenado (crescente)
inverso (decrescente)
aleatório
MedidorTempo.java
Classe utilitária que mede tempos de execução utilizando System.nanoTime() e converte para milissegundos; calcula médias entre execuções.

Principal.java
Classe que orquestra a bateria de testes:

itera tamanhos (100, 1.000, 10.000)
itera tipos de ordenação de dados (crescente, decrescente, aleatório)
executa inserção, busca e ordenação
repete cada teste 5 vezes e apresenta média
TesteInsercao.java Rodar apenas testes de inserção (útil para debug e ajustes de parâmetros).

TesteBusca.java Rodar apenas testes de busca em uma estrutura escolhida (Vetor / ArvoreBinaria / ArvoreAVL).

TesteOrdenacao.java Rodar comparativo entre BubbleSort e MergeSort isoladamente.

⚙️ Como Compilar
Pelo terminal (linha de comando)
Abra terminal e entre na pasta do projeto:
cd analisededesempenho

1. Compile todos os arquivos Java:

javac *.java
java Principal

3. Executar testes isolados:

java TesteInsercao
java TesteBusca
java TesteOrdenacao

🎛️ Personalizando os Testes

 Você pode editar os arquivos de teste (ou ajustar diretamente no Principal.java) para alterar:
   Quantidade de elementos (tamanho)
   Número de repetições (repeticoes)
   Estrutura de dados usada na busca (estrutura)

 Exemplos de configuração:

TesteInsercao.java
   int tamanho = 100;    altere para 1000 ou 10000
   int repeticoes = 5;   média sobre X execuções

TesteBusca.java
   int tamanho = 1000;
   String estrutura = "Vetor"; opções: "Vetor", "ArvoreBinaria", "ArvoreAVL"

TesteOrdenacao.java
   int tamanho = 1000;