package algorithms.search;

import java.util.*;

public class BestFirstSearch extends BreadthFirstSearch {
    Queue<AState> queue= new LinkedList<AState>();

    @Override
    public Solution solve(ISearchable maze) {

        Queue<AState> queue = new PriorityQueue<>( (a,b) -> a.getCost() - b.getCost());
        HashSet<String> visited = new HashSet<>();

        queue.add(maze.getStart());
        visited.add(maze.getStart().getCurNode());

        AState minState = null;
        int minStateCost = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            NumberOfNodesEvaluated++;
            AState state = queue.poll();
            if (maze.AreWeThereYet(state)) //checks if reach the goal and if minmum
                return new Solution(state);
//                if (minStateCost > state.Cost) {
//                    minState = state;
//                    minStateCost = state.Cost;
//                    continue;
//                }

            ArrayList<AState> neighbors = maze.getAllPossibleStates(state);
            for (AState tmpState : neighbors) {
                if (!visited.contains(tmpState.getCurNode())) {
                    visited.add(tmpState.getCurNode());
                    queue.add(tmpState);
                }
            }
        }
        return new Solution(minState);
    }


    @Override
    public String getName() {
        return "BestFirstSearch";
    }
}
