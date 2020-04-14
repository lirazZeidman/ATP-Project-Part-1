package algorithms.search;

import java.util.ArrayList;

public class Solution {
    private  ArrayList<AState> SolutionPath;
    private int cost;

    /**
     * Builder for the solution gets A state and saves all the path to him.
     * @param state The goal and he's all ancestors. if null saves empty list and the distance as -1.
     */
    public Solution(AState state) {
        if(state==null){
            SolutionPath=new ArrayList<>();
            cost=-1;
            return;
        }
        cost = state.Cost;
        ArrayList<AState> solution= new ArrayList<AState>();
        while (state.getPrev()!=null){
            solution.add(0,state);
            state=state.getPrev();
        }
        solution.add(0,state);
        SolutionPath = solution;
    }

    public int getCost() { return cost;    }

    public ArrayList<AState> getSolutionPath() {
        return SolutionPath;
    }
}
