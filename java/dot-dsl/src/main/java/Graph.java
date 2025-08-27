import java.util.*;

public class Graph {
    private final Map<String, String> attributes;
    private final Set<Node> nodes;
    private final Set<Edge> edges;

    public Graph() {
        this.attributes = new HashMap<>();
        this.nodes = new HashSet<>();
        this.edges = new HashSet<>();
    }

    public Graph(Map<String, String> attributes) {
        this.attributes = attributes;
        this.nodes = new HashSet<>();
        this.edges = new HashSet<>();
    }

    public Collection<Node> getNodes() {
        return nodes;
    }

    public Collection<Edge> getEdges() {
        return edges;
    }

    public Graph node(String name) {
        this.nodes.add(new Node(name));
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        this.nodes.add(new Node(name, attributes));
        return this;
    }

    public Graph edge(String start, String end) {
        this.edges.add(new Edge(start, end));
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        this.edges.add(new Edge(start, end, attributes));
        return this;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }
}
