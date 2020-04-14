package algorithms.search;

import java.util.ArrayList;


public interface ISearchable {
    /**
     *
     * @param pos The pos we want to return all he's neighbors.
     * @return All the valid neighbors.
     */
     ArrayList<AState> getAllPossibleStates(AState pos);
     AState getStart();
     AState getGoal();
     boolean AreWeThereYet(AState x);
}
