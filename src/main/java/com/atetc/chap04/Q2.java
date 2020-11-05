package com.atetc.chap04;

import com.atetc.helpers.DGraph;
import com.atetc.helpers.GraphNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Given a directed graph, design an algorithm to find out
 * whether there is a route between two nodes.
 */
public class Q2 {

    public static boolean dfs(DGraph g, GraphNode start, GraphNode end) {
        LinkedList<GraphNode> stack = new LinkedList<>();
        for (GraphNode u : g.getNodes()) {
            u.state = GraphNode.State.UNVISITED;
        }
        start.state = GraphNode.State.VISITING;
        stack.add(start);
        GraphNode u;
        while(!stack.isEmpty())
        {
            u = stack.removeFirst(); // i.e., pop()
            if (u != null) {
                for (GraphNode v : u.getAdjacent()) {
                    if (v.state == GraphNode.State.UNVISITED) {
                        if (v == end) {
                            return true;
                        }
                        else {
                            v.state = GraphNode.State.VISITING;
                            stack.add(v);
                        }
                    }
                }
                u.state = GraphNode.State.Visited;
            }
        }
        return false;
    }

    public static boolean DFSRecursive(GraphNode n1, GraphNode n2) {
        if (n1 == null || n2 == null) {
            return false;
        }

        if (n1 == n2) {
            return true;
        }

        n1.isVisited = true;

        for (GraphNode child : n1.adjacent) {
            if (!child.isVisited) {
                if (DFSRecursive(child, n2)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean DFSIterative(GraphNode n1, GraphNode n2) {
        if (n1 == null || n2 == null) {
            return false;
        }

        if (n1 == n2) {
            return true;
        }

        Stack<GraphNode> stack = new Stack<>();
        stack.push(n1);
        while (!stack.isEmpty()) {
            GraphNode n = stack.pop();
            if (!n.isVisited) {
                n.isVisited = true;
                if (n == n2) return true;
                stack.addAll(n.adjacent);
            }
        }

        return false;
    }

    public static boolean BFS(GraphNode n1, GraphNode n2) {
        if (n1 == null || n2 == null) {
            return false;
        }

        if (n1 == n2) {
            return true;
        }

        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(n1);
        while (!queue.isEmpty()) {
            GraphNode n = queue.remove();
            if (!n.isVisited) {
                n.isVisited = true;
                if (n == n2) return true;
                queue.addAll(n.adjacent);
            }
        }

        return false;
    }

    public static void resetVisited(GraphNode... nodes) {
        for (GraphNode n : nodes) {
            n.isVisited = false;
        }
    }
}
