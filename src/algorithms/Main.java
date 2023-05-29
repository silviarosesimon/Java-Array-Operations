package algorithms;

public class Main {

    public static void main(String[] args) {
        Tree<Integer> root = Tree.of(10);
        Tree<Integer> rootFirstChild = root.addChild(2);
        Tree<Integer> depthMostChild = rootFirstChild.addChild(3);
        Tree<Integer> rootSecondChild = root.addChild(4);

        BreadthFirstSearch.searchTree(4, root);

        Node<Integer> start = new Node<>(10);
        Node<Integer> firstNeighbor = new Node<>(2);
        start.connect(firstNeighbor);

        Node<Integer> firstNeighborNeighbor = new Node<>(3);
        firstNeighbor.connect(firstNeighborNeighbor);
        firstNeighborNeighbor.connect(start);

        Node<Integer> secondNeighbor = new Node<>(4);
        start.connect(secondNeighbor);

        BreadthFirstSearch.searchGraph(4, start);


    }
}
