package algorithms.search;

import algorithms.mazeGenerators.Position;

import java.util.List;

public interface ISearchable {

    public List<Position> getAllPossibleStates(int x, int y);



}
