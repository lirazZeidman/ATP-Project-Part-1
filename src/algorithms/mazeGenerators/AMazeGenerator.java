package algorithms.mazeGenerators;

public abstract class AMazeGenerator implements  IMazeGenerator{
    @Override
    /**
     * measuring the time to create a maze sized row*column
     * @param row - row size of the maze
     * @param column - column size of the maze
     * @return the time measured
     */
    public long measureAlgorithmTimeMillis(int row, int column) {
        if(row<0||column<0)
            return 0;
        long StartTime= System.currentTimeMillis();
        generate(row,column);
        long EndTime=System.currentTimeMillis();
        return EndTime-StartTime;

    }

}
