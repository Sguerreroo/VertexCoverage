public class Edge {

    private int node1, node2;

    public Edge(int node1, int node2) {
        this.node1 = node1;
        this.node2 = node2;
    }

    public int getNode1() {
        return node1;
    }

    public int getNode2() {
        return node2;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "node1=" + node1 +
                ", node2=" + node2 +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Edge) {
            Edge e = (Edge) obj;
            return ((e.getNode1() == this.getNode1() && e.getNode2() == this.getNode2())
                    || (e.getNode1() == this.getNode2() && e.getNode2() == this.getNode1()));
        }
        return false;
    }
}
