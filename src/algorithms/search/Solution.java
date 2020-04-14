package algorithms.search;

import java.util.ArrayList;

public class Solution {
    private  ArrayList<AState> SolutionPath;
    private int cost;


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
