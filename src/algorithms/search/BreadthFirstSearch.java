package algorithms.search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch extends ASearchingAlgorithm {
    protected Queue<AState> queue;
    /**
     * A searching algorithm that return the shortest path.
     */

    public BreadthFirstSearch(){
        queue= new LinkedList<AState>();
    }

    /**
     *
     * @param maze A searchable domain that we search the path their
     * @return return solution as the shortest path.
     */
    @Override
    public Solution solve(ISearchable maze) {
        if (maze==null||maze.getStart()== null || maze.getGoal()==null)
            return new Solution(null);
        NumberOfNodesEvaluated=0;
        queue.clear();
        HashSet<String> visited= new HashSet<String>();
        queue.add(maze.getStart());
        visited.add(maze.getStart().getCurNode());
        while(!queue.isEmpty()) {
            NumberOfNodesEvaluated++;
            AState state = queue.poll();
            System.out.println(state.CurNode);
            ArrayList<AState> neighbors = maze.getAllPossibleStates(state);
            for (AState tmpState : neighbors) {
                if (!visited.contains(tmpState.getCurNode())) {
                    if (maze.AreWeThereYet(tmpState)) //checks if reach the goal and if minimum
                        return new Solution(tmpState);
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