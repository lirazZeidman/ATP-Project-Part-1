package algorithms.search;

import java.util.*;

public class BestFirstSearch extends BreadthFirstSearch{
    /**
     * A searching algorithm that return the shortest path.
     * Inserts from BFS and changing the queue to priority queue.
     */
    public BestFirstSearch(){
            queue= new PriorityQueue<AState>((x, y) -> x.getCost() - y.getCost());
    }
    @Override
    public String getName() {
        return "BestFirstSearch";
    }
}
