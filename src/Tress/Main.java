package Tress;

public class Main {
    void main() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.addNode(5);
        tree.addNode(7);
        tree.addNode(3);
        tree.addNode(11);
        tree.addNode(10);

        System.out.println();
        tree.preOrder();
        System.out.println();
        tree.inOrder();
        System.out.println();
        tree.postOrder();
        System.out.println();

        int totalFolhas = tree.countLeaves();
        System.out.println("Quantidade de nós folhas: " + totalFolhas);
    }
}
