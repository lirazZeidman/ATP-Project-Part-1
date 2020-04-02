package algorithms.search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch extends ASearchingAlgorithm {
    Queue<AState> queue= new LinkedList<AState>();


    @Override
    public Solution solve(ISearchable maze) {
        HashSet<String> visited= new HashSet<String>();
        queue.add(maze.getStart());
        visited.add(maze.getStart().getCurNode());
        while(!queue.isEmpty()) {
            NumberOfNodesEvaluated++;
            AState state = queue.poll();
            if (maze.AreWeThereYet(state)) //checks if reach the goal and if minimum
                return new Solution(state);
            ArrayList<AState> neighbors = maze.getAllPossibleStates(state);
            for (AState tmpState : neighbors) {
                if (!visited.contains(tmpState.getCurNode())) {
                    visited.add(tmpState.getCurNode());
                    queue.add(tmpState);
                }
            }
        }
        return null;
    }

    @Override
    public String getName() {
        return "BreadthFirstSearch";
    }


}