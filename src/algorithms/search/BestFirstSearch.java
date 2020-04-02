package algorithms.search;

public class BestFirstSearch extends BreadthFirstSearch {
    @Override
    public Solution solve(ISearchable maze) {

        //Queue<AState> queue= new PriorityQueue<>();
        //ArrayList<AState> visited= new ArrayList<AState>();
//
        //queue.add(maze.getStart());
        //visited.add(maze.getStart());
//
        //AState minState = null;
        //int minStateCost = Integer.MAX_VALUE;
//
        //while(!queue.isEmpty()) {
        //    AState state = queue.poll();
        //    if (maze.AreWeThereYet(state)) //checks if reach the goal and if minmum
        //        if(minStateCost>state.Cost){
        //            minState=state;
        //            minStateCost=state.Cost;
        //            continue;
        //        }
//
//
        //    ArrayList<AState> neighbors = maze.getAllPossibleStates(state);
        //    for (AState tmpState : neighbors) {
        //        if (!ListContains(visited, tmpState)) {
        //            visited.add(tmpState);
        //            queue.add(tmpState);
        //        }
        //    }
        //    //visited.add(state);
        //}
        //return new Solution(minState);
    return null;    }

    @Override
    public String getName() {
        return "BestFirstSearch";
    }
}
