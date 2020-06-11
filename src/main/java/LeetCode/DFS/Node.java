package LeetCode.DFS;

public class Node implements Comparable<Node>{
    int id;

    @Override
    public int compareTo(Node o) {
        return this.id-o.id;
    }

    public Node(int id) {
        this.id = id;
    }
}
