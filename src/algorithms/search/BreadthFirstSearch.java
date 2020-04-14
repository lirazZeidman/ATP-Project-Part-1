package algorithms.search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch extends ASearchingAlgorithm {
    protected Queue<AState> queue;
    public BreadthFirstSearch(){
        queue= new LinkedList<AState>();
    }

    @Override
    public Solution solve(ISearchable maze) {
        if ( maze==null||maze.getStart()== null || maze.getGoal()==null)
            return new Solution(null);
        queue.clear();
        HashSet<String> visited= new HashSet<String>();
        Queue<AState> queue= new LinkedList<AState>();
        queue.add(maze.getStart());
        visited.add(maze.getStart().getCurNode());
        while(!queue.isEmpty()) {
            AState state = queue.poll();
            if (maze.AreWeThereYet(state)) //checks if reach the goal and if minimum
                return new Solution(state);
            ArrayList<AState> neighbors = maze.getAllPossibleStates(state);
            for (AState tmpState : neighbors) {
                if (!visited.contains(tmpState.getCurNode())) {
                    NumberOfNodesEvaluated++;
                    visited.add(tmpState.getCurNode());
                    queue.add(tmpState);
                }
            }
        }
        return new Solution(null);
    }

    @Override
    public String getName() {
        return "BreadthFirstSearch";
    }


}