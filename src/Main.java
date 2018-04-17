import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Graph g1");
        int nodes = 5;
        int opt = 2;
        List<Edge> edgeList1 = new ArrayList<>();
        edgeList1.add(new Edge(1,2));
        edgeList1.add(new Edge(1,5));
        edgeList1.add(new Edge(2,3));
        edgeList1.add(new Edge(2,4));
        edgeList1.add(new Edge(2,5));
        edgeList1.add(new Edge(4,5));
        Graph g1 = new Graph(nodes,edgeList1);
        Test.testGraph(g1, opt);


        System.out.println("Graph g2");
        nodes = 6;
        opt = 3;
        List<Edge> edgeList2 = new ArrayList<>();
        edgeList2.add(new Edge(1,2));
        edgeList2.add(new Edge(1,5));
        edgeList2.add(new Edge(2,3));
        edgeList2.add(new Edge(2,5));
        edgeList2.add(new Edge(3,4));
        edgeList2.add(new Edge(4,5));
        edgeList2.add(new Edge(4,6));
        Graph g2 = new Graph(nodes,edgeList2);
        Test.testGraph(g2, opt);


        System.out.println("Graph g3");
        nodes = 6;
        List<Edge> edgeList3 = new ArrayList<>();
        edgeList3.add(new Edge(1,2));
        edgeList3.add(new Edge(1,3));
        edgeList3.add(new Edge(2,4));
        edgeList3.add(new Edge(2,6));
        edgeList3.add(new Edge(3,4));
        edgeList3.add(new Edge(3,5));
        edgeList3.add(new Edge(4,5));
        edgeList3.add(new Edge(4,6));
        Graph g3 = new Graph(nodes,edgeList3);
        Test.testGraph(g3, opt);


        System.out.println("Graph g4");
        nodes = 6;
        opt = 2;
        List<Edge> edgeList4 = new ArrayList<>();
        edgeList4.add(new Edge(1,2));
        edgeList4.add(new Edge(2,5));
        edgeList4.add(new Edge(2,4));
        edgeList4.add(new Edge(3,2));
        edgeList4.add(new Edge(4,5));
        edgeList4.add(new Edge(5,6));
        Graph g4 = new Graph(nodes,edgeList4);
        Test.testGraph(g4, opt);

    }

}
