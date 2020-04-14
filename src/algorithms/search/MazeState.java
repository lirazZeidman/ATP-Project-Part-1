package algorithms.search;

import algorithms.mazeGenerators.Position;

public class MazeState extends AState   {
    /**
     * Adapter to A state from Maze
     * @param curNode the position as string.
     * @param prev he's ancestors.
     * @param cost the cost to get to him (can be the cost or distance).
     */
    public MazeState(Position curNode, AState prev, int cost) {
        super(curNode.toString(), prev, cost);
    }

}
