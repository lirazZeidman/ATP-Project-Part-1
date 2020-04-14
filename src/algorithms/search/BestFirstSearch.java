package algorithms.search;

import java.util.*;

public class BestFirstSearch extends BreadthFirstSearch{

    public BestFirstSearch(){
            queue= new PriorityQueue<AState>((x, y) -> x.getCost() - y.getCost());
    }

//    public Solution solve(ISearchable maze) {
//        if (maze.getStart()== null || maze.getGoal()==null || maze==null)
//            return new Solution(null);
//        NumberOfNodesEvaluated=0;
//        HashSet<String> visited = new HashSet<>();
//        Queue<AState> queue = new PriorityQueue<>( (a,b) -> a.getCost() - b.getCost());
//        queue.add(maze.getStart());
//        visited.add(maze.getStart().getCurNode());
//        AState minState=null;
//        int minStateCost=Integer.MAX_VALUE;
//        while(!queue.isEmpty()) {
//            AState state = queue.poll();
//
//            if (maze.AreWeThereYet(state)) //checks if reach the goal and if minimum
//                if(state.getCost()<=minStateCost){
//                    minStateCost=state.getCost();
//                    minState=state;
//                    continue;
//                }
//            ArrayList<AState> neighbors = maze.getAllPossibleStates(state);
//            for (AState tmpState : neighbors)
//                if (!visited.contains(tmpState.getCurNode())){
//                    NumberOfNodesEvaluated++;
//                    visited.add(tmpState.getCurNode());
//                    queue.add(tmpState);
//                }
//        }
//        return new Solution(minState);
//    }
    @Override
    public String getName() {
        return "BestFirstSearch";
    }
}
