package algorithms.search;

import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstSearch extends ASearchingAlgorithm {
//    private ArrayList<AState> VistiedState;

    @Override
    public Solution solve(ISearchable maze) {
        NumberOfNodesEvaluated=0;
        ArrayList<AState> VistiedState = new ArrayList<AState>();
        Stack<AState> stack = new Stack<AState>();
        AState min = null;
        int tmp_min = Integer.MAX_VALUE;
        stack.push(maze.getStart());
        while (!stack.empty()) {
            NumberOfNodesEvaluated++;
            AState node = stack.pop();
            if (maze.AreWeThereYet(node)) //checks if reach the goal and if minmum
                if (node.Cost < tmp_min) {
                    tmp_min = node.Cost;
                    min = node;
                    continue;
                }
            if (!ListContains(VistiedState, node)) { //checks if vistied
                VistiedState.add(node);
                ArrayList<AState> neighbors = maze.getAllPossibleStates(node); //checks all the
                for (AState neighbor : neighbors)
                    if (!ListContains(VistiedState, neighbor)) {
                        stack.push(neighbor);
                    }
            }
        }


        return  new Solution(min);
    }

    @Override
    public String getName() {
        return "DepthFirstSearch";
    }


    public boolean ListContains(ArrayList<AState> lst, AState tocomp) {
        for (AState state : lst) {
            if (state.equals(tocomp))
                return true;
        }
        return false;
    }

}