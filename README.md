# Árvore Binária de Busca em Java

**Nome do Aluno:** Vitor Hugo da Silva

## Breve descrição do projeto
Este projeto consiste em uma implementação acadêmica de uma Árvore Binária de Busca (Binary Search Tree - BST) na linguagem Java. A estrutura permite a inserção ordenada de números inteiros, a execução de percursos clássicos de travessia (Pré-ordem, Em-ordem e Pós-ordem) e possui uma funcionalidade específica para realizar a contagem de nós folhas (nós que não possuem filhos) presentes na árvore.

## Como a estrutura foi implementada
O projeto foi estruturado utilizando o paradigma de Orientação a Objetos, dividido em três classes principais, localizadas no pacote `Tress`:

*   **Node.java:** Representa a entidade mais básica da árvore. Cada nó armazena um valor inteiro e mantém referências (ponteiros) para o seu filho à esquerda e o seu filho à direita.
*   **BinarySearchTree.java (Tree):** Concentra toda a lógica e as operações da estrutura de dados. Utiliza algoritmos recursivos para realizar a inserção dos nós (valores menores à esquerda, maiores à direita), executar as travessias de impressão e varrer a árvore para calcular a quantidade exata de folhas.
*   **Main.java:** Classe responsável por testar e validar o comportamento da árvore. Ela instancia a estrutura, insere um conjunto de dados para simulação e imprime as saídas no terminal.

## Exemplo de Utilização
Abaixo está um exemplo de como a árvore é instanciada, preenchida com nós e como a contagem de folhas é acionada e exibida no console:

```java
// 1. Criação e inicialização da árvore
BinarySearchTree tree = new BinarySearchTree();

// 2. Inserção de nós na árvore
tree.addNode(5);
tree.addNode(7);
tree.addNode(3);
tree.addNode(11);
tree.addNode(10);

/*
 Representação visual da árvore criada:
        5
       / \
      3   7
           \
            11
           /
         10
         
 Os nós folhas nesta estrutura são: 3 e 10.
*/

// 3. Exibição da contagem de folhas
int totalFolhas = tree.countLeaves();
System.out.println("Quantidade de nós folhas: " + totalFolhas); // Saída esperada: 2
