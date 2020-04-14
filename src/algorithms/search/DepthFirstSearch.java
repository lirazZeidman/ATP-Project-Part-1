package algorithms.search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class DepthFirstSearch extends ASearchingAlgorithm {

    public DepthFirstSearch(){}


    @Override
    public Solution solve(ISearchable maze) {
        if (maze.getStart()== null || maze.getGoal()==null || maze==null)
            return new Solution(null);
        NumberOfNodesEvaluated=0;
        HashSet<String> VistiedState = new HashSet<String>();
        Stack<AState> stack = new Stack<AState>();
        AState min = null;
        stack.push(maze.getStart());
        while (!stack.empty()) {
            AState node = stack.pop();
            if (maze.AreWeThereYet(node)) //checks if reach the goal and if minimum
                return  new Solution(node);
            if (!VistiedState.contains(node.getCurNode())) { //checks if vistied
                NumberOfNodesEvaluated++;
                VistiedState.add(node.getCurNode());
                ArrayList<AState> neighbors = maze.getAllPossibleStates(node); //checks all the
                for (AState neighbor : neighbors)
                    if (!VistiedState.contains(neighbor.getCurNode()))
                        stack.push(neighbor);
            }
        }
        return new Solution (null);
    }

    @Override
    public String getName() {
        return "DepthFirstSearch";
    }


}