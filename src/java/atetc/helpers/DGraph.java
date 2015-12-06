package atetc.helpers;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Dev_Android on 20.11.2015.
 */
public class DGraph {

    private ArrayList<GraphNode> mNodes = new ArrayList<>();

    public ArrayList<GraphNode> getNodes() {
        return mNodes;
    }

    public void add(GraphNode... nodes) {
        Collections.addAll(mNodes, nodes);
    }
}