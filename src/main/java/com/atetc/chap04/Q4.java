package com.atetc.chap04;

import com.atetc.helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Given a binary search tree, design an algorithm which creates a linked list of all the nodes at each depth.
 */
public class Q4 {

    public static ArrayList<LinkedList<BinaryTreeNode>> findLevelLinkList(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }

        ArrayList<LinkedList<BinaryTreeNode>> result = new ArrayList<>();
        int level = 0;

        LinkedList<BinaryTreeNode> list = new LinkedList<>();
        list.add(root);

        while (list.size() > 0) {
            result.add(level, list);
            list = new LinkedList<>();
            for (int i = 0; i < result.get(level).size(); i++){
                BinaryTreeNode node = result.get(level).get(i);
                if (node != null) {
                    if (node.left != null) {
                        list.add(node.left);
                    }

                    if (node.right!= null) {
                        list.add(node.right);
                    }
                }
            }

            level++;
        }

        return result;
    }
}
