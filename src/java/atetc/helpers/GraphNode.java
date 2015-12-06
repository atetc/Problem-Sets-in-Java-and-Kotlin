package atetc.helpers;

import java.util.ArrayList;

public class GraphNode {
    public int value;
    public boolean isVisited;
    public ArrayList<GraphNode> adjacent;
    public State state;

    public GraphNode(int x) {
        value = x;
        isVisited = false;
        adjacent = new ArrayList<>();
    }

    public ArrayList<GraphNode> getAdjacent() {
        return adjacent;
    }

    public enum State {
        UNVISITED, Visited, VISITING;
    }
}