package algorithms.search;

import java.util.ArrayList;

public class Solution {
    private  ArrayList<AState> SolutionPath;


    public Solution(AState state) {
        ArrayList<AState> solution= new ArrayList<AState>();
        while (state.getPrev()!=null){
            solution.add(0,state);
            state=state.getPrev();
        }
        solution.add(0,state);
        SolutionPath = solution;
    }

    public ArrayList<AState> getSolutionPath() {
        return SolutionPath;
    }
}
