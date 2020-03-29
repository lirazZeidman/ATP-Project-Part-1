package algorithms.search;

import algorithms.mazeGenerators.Position;

public class MazeState extends AState   {
    private Position CurPosition;


    public MazeState(int d, int value, AState father, Position curPosition) {
        super(d, value, father);
        CurPosition = curPosition;
    }

    public Position getCurPosition() {
        return CurPosition;
    }

    @Override
    public String toString() {
        return this.CurPosition.toString();
    }


}
