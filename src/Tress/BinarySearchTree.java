package Tress;

public class BinarySearchTree {
    public Node root;

    public void addNode(int value){
        root = addNodeIn(value, root);
    }

    private Node addNodeIn(int value, Node currentNode){
        if(currentNode == null){
            return new Node(value);
        }

        if(value < currentNode.value){
            currentNode.left = addNodeIn(value,currentNode.left);
        }

        else if (value > currentNode.value){
            currentNode.right = addNodeIn(value, currentNode.right);
        }

        return currentNode;
    }

    public void preOrder() { preOrderTraversal(root); }

    private void preOrderTraversal(Node currentNode) {
        if(currentNode != null){
            System.out.print(currentNode.value + " ");
            preOrderTraversal(currentNode.left);
            preOrderTraversal(currentNode.right);
        }
    }

    public void inOrder() { inOrderTraversal(root); }

    private void inOrderTraversal(Node currentNode) {
        if(currentNode != null){
            inOrderTraversal(currentNode.left);
            System.out.print(currentNode.value + " ");
            inOrderTraversal(currentNode.right);
        }
    }

    public void postOrder() { postOrderTraversal(root); }

    private void postOrderTraversal(Node currentNode) {
        if(currentNode != null){
            postOrderTraversal(currentNode.left);
            postOrderTraversal(currentNode.right);
            System.out.print(currentNode.value + " ");
        }
    }

    public int countLeaves() {
        return countLeavesRecursive(root);
    }

    private int countLeavesRecursive(Node currentNode) {
        if (currentNode == null) {
            return 0;
        }

        if (currentNode.left == null && currentNode.right == null) {
            return 1;
        }

        return countLeavesRecursive(currentNode.left) + countLeavesRecursive(currentNode.right);
    }


}
