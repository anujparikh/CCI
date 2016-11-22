import java.util.*;

/**
 * Created by anujparikh on 11/21/16.
 */
public class Graph {

    Node startNode;
    int size;

    public static class Node {
        int key;
        boolean isVisited;

        Node(int key) {
            this.key = key;
            isVisited = false;
        }
    }

    private HashMap<Integer, List<Node>> adj;

    Graph(Node startNode) {
        this.adj = new HashMap<>();
        this.startNode = startNode;
        this.size = 0;
    }

    public void addEdge(Node u, Node v) {
        List<Node> list;

        if (adj.containsKey(u.key)) {
            list = adj.get(u.key);
            list.add(v);
        } else {
            list = new ArrayList<>();
            list.add(v);
            adj.put(u.key, list);
        }
        size++;
    }

    public void printGraph() {
        for (Map.Entry<Integer, List<Node>> entrySet : adj.entrySet()) {
            for (Node i : entrySet.getValue()) {
                System.out.println(entrySet.getKey() + " ---> " + i.key);
            }
            System.out.println();
        }
    }

    public void printDepthFirstTraversal(Node node) {
        if (node == null || node.isVisited) {
            return;
        }
        System.out.println(node.key + " ");
        node.isVisited = true;
        List<Node> list = adj.get(node.key);
        list.forEach(this::printDepthFirstTraversal);
    }

    /*public void printBreathFirstTraversal(Node node) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            System.out.println("Queue: " + queue);
            Node n = queue.poll();
            System.out.println("After Queue: " + queue);
            System.out.println(n.key + " ");
            adj.get(node.key).forEach(i -> {
                if (!i.isVisited) queue.add(i);
            });
            n.isVisited = true;
        }
    }*/

    public static void main(String args[]) {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        Graph graph = new Graph(n2);

        graph.addEdge(n0, n2);
        graph.addEdge(n0, n1);
        graph.addEdge(n2, n0);
        graph.addEdge(n2, n3);
        graph.addEdge(n3, n3);
        graph.addEdge(n1, n2);
        graph.printGraph();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
        graph.printDepthFirstTraversal(graph.startNode);
    }
}
