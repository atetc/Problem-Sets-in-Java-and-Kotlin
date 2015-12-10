package atetc.other.trees;

import atetc.structures.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given a tree of N nodes, select any two nodes such that the distance between them is an even number. Count the possible number of unique selections based on the above statement.

 Monty fears his algorithm is not correct; solve the problem so he can compare results.

 Note: Two pairs are considered different if at least one node is different in both pairs.
 */
public class Q2 {

    public static int getNumberOfEvenDistanceUniqueSelections(Tree tree) {
        int result = 0;

        if (tree == null) {
            return result;
        }

        Tree.Node root = tree.getRoot();
        if (root.getChildren() == null  || root.getChildren().isEmpty()) {
            return result;
        }

        int level = 0;
        HashMap<Integer, List<Tree.Node>> levels = new HashMap<>();

        Tree.Node node = root;
        levels.put(0, new ArrayList<Tree.Node>() {{
         add(root);
        }});

        while (node.getChildren() != null) {
            level++;
            levels.put(level, node.getChildren());
        }

        return result;
    }
}