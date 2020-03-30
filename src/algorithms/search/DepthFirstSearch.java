package algorithms.search;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstSearch extends ASearchingAlgorithm {
//    private ArrayList<AState> VistiedState;

    @Override
    public Solution solve(ISearchable maze) {
        ArrayList<AState> VistiedState= new ArrayList<AState>();
        Stack <AState> stack= new Stack<AState>();
        stack.push(maze.getStart());
        while(!stack.empty()){
            AState node= stack.pop();
            if (!ListContains(VistiedState,node)){
                VistiedState.add(node);

            }
        }



        return null;
    }

    @Override
    public String getName() {
        return "DepthFirstSearch";
    }


    public boolean ListContains(@NotNull ArrayList<AState> lst, AState tocomp ) {
        for (AState state : lst) {
            if (state.equals(tocomp))
                return true;
        }
        return false;
    }

}
