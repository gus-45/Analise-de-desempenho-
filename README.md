# 📊 Análise de Desempenho de Estruturas de Dados em Java

## 1. Introdução

O **projeto Análise de Desempenho de Estruturas de Dados** é uma aplicação Java desenvolvida para comparar empiricamente o desempenho de diferentes estruturas de dados (Vetor, Árvore Binária de Busca e Árvore AVL) e algoritmos de ordenação (BubbleSort e MergeSort) em operações de inserção, busca e ordenação.

## 2. Arquitetura
   
O projeto adota uma arquitetura modular baseada em Separação de Responsabilidades, onde cada classe tem uma função específica e bem definida.

### Estrutura de Pastas

```
analisededesempenho/
├── No.java                    # Nó para estruturas de árvore
├── Vetor.java                 # Estrutura de vetor com buscas
├── ArvoreBinaria.java         # Árvore Binária de Busca
├── ArvoreAVL.java             # Árvore AVL auto-balanceada
├── Ordenacao.java             # Algoritmos de ordenação
├── GeradorDados.java          # Geração de conjuntos de dados
├── MedidorTempo.java          # Medição e cálculo de tempos
├── Principal.java             # Orquestrador de testes completos
├── TesteInsercao.java         # Testes isolados de inserção
├── TesteBusca.java            # Testes isolados de busca
└── TesteOrdenacao.java        # Testes isolados de ordenação
```

### Fluxo de Execução

1. **Requisição**: Usuário executa a classe Principal ou de Teste( opcional)
2. **GeradorDados**: Cria conjuntos de dados (ordenados, inversos, aleatórios)
3. **Estruturas**: Recebem os dados e executam operações (inserção/busca)
4. **MedidorTempo**: Captura tempos de execução usando System.nanoTime()
5. **Cálculo**: Média de 5 execuções para cada teste
6. **Resposta**: Resultados formatados exibidos no console
   
---

## 3. Como Rodar o Projeto

### 1. Clonar o Repositório

```bash
git clone [seu-link-do-repositorio]
cd analisededesempenho
```

### 2. Compilar o Projeto

```bash
javac *.java
```

### 3. Executar Testes Completos

```bash
java Principal
```

### 4. Executar Testes Isolados

```bash
# Testar apenas inserção
java TesteInsercao

# Testar apenas busca
java TesteBusca

# Testar apenas ordenação
java TesteOrdenacao
```
---

## 6. Testes

### 6.1. Principal

Executa a bateria completa de testes com 5 repetições para cada operação, testando tamanhos de 100, 1000 e 10000 elementos.

### 6.2. TesteInsercao

Testa apenas as operações de inserção nas três estruturas (Vetor, Árvore Binária e Árvore AVL) com os três tipos de dados (ordenados, inversos e aleatórios).
**Configuração**: Abra o arquivo TesteInsercao.java e ajuste o tamanho conforme desejado.

```bash
int tamanho = 100;  // Mude para 1000 ou 10000
```

### 6.3. TesteBusca

Testa apenas as operações de busca em uma estrutura específica, buscando o primeiro elemento, último, meio, aleatório e inexistente.
**Configuração**: Abra o arquivo TesteBusca.java e configure o tamanho e a estrutura desejada.

```bash
int tamanho = 1000;                    // Tamanho do conjunto de dados
String estrutura = "Vetor";            // Opções: "Vetor", "ArvoreBinaria", "ArvoreAVL"
```

### 6.4. TesteOrdenacao

Testa apenas os algoritmos de ordenação (BubbleSort e MergeSort) com os três tipos de dados.
**Configuração**: Abra o arquivo TesteOrdenacao.java e ajuste o tamanho conforme desejado.

```bash
int tamanho = 1000;  // Mude para 100 ou 10000
```

## 7. Integrante do Projeto

Este **projeto foi desenvolvido como trabalho acadêmico** da disciplina Estruturas de Dados.

```bash
Autor: Gustavo Soares Monteiro
```