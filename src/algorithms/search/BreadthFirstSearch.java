package algorithms.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch extends ASearchingAlgorithm {


    @Override
    public Solution solve(ISearchable maze) {
        Queue<AState> queue= new LinkedList<AState>();
        Queue<AState> visited= new LinkedList<AState>();

        AState minCostState=null;
        int minCost=Integer.MAX_VALUE;

        queue.add(maze.getStart());
        while(!queue.isEmpty()) {
            AState state = queue.poll();
            if (maze.AreWeThereYet(state)) {//checks if reach the goal and if minmum
                if (state.Cost < minCost) {
                    minCost = state.Cost;
                    minCostState = state;

                }
            }
            else if (!visited.contains(state)) {
                visited.add(state);

                ArrayList<AState> neighbors=maze.getAllPossibleStates(state);
                for (AState tmpState:  neighbors){
                    if(!visited.contains(tmpState))
                        queue.add(tmpState);
                }
            }
        }

        return new Solution(minCostState);
    }

    @Override
    public String getName() {
        return "BreadthFirstSearch";
    }


}