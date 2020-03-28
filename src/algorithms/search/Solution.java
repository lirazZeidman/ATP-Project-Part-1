package algorithms.search;

import java.util.ArrayList;

public class Solution {
    private  ArrayList<algorithms.search.AState> SolutionPath;


    public Solution(ArrayList<algorithms.search.AState> solutionPath) {
        SolutionPath = solutionPath;
    }

    public ArrayList<algorithms.search.AState> getSolutionPath() {
        return SolutionPath;
    }
}
