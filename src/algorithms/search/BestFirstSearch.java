package algorithms.search;

import java.util.*;

public class BestFirstSearch extends BreadthFirstSearch{

    public BestFirstSearch(){
            queue= new PriorityQueue<AState>((x, y) -> x.getCost() - y.getCost());
    }
    @Override
    public String getName() {
        return "BestFirstSearch";
    }
}
