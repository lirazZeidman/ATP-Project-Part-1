package algorithms.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch extends ASearchingAlgorithm {


    @Override
    public Solution solve(ISearchable maze) {
        Queue<AState> queue= new LinkedList<AState>();
        ArrayList<AState> visited= new ArrayList<AState>();

        queue.add(maze.getStart());
        visited.add(maze.getStart());
        while(!queue.isEmpty()) {
            AState state = queue.poll();
            if (maze.AreWeThereYet(state)) //checks if reach the goal and if minmum
                return new Solution(state);


            ArrayList<AState> neighbors = maze.getAllPossibleStates(state);
            for (AState tmpState : neighbors) {
                if (!ListContains(visited, tmpState)) {
                    visited.add(tmpState);
                    queue.add(tmpState);
                }
            }
            //visited.add(state);
        }
        return null;
    }

    @Override
    public String getName() {
        return "BreadthFirstSearch";
    }


}