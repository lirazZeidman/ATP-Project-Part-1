package algorithms.search;

import java.util.*;

public class BestFirstSearch extends BreadthFirstSearch{
    Queue<AState> queue = new PriorityQueue<>( (a,b) -> a.getCost() - b.getCost());
    HashSet<String> visited = new HashSet<>();


    @Override
    public String getName() {
        return "BestFirstSearch";
    }
}
