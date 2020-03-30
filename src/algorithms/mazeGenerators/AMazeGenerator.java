package algorithms.mazeGenerators;

public abstract class AMazeGenerator implements  IMazeGenerator{
    @Override
    public long measureAlgorithmTimeMillis(int row, int column) {
        if(row<0||column<0)
            return 0;
        long StartTime= System.currentTimeMillis();
        generate(row,column);
        long EndTime=System.currentTimeMillis();
        return EndTime-StartTime;

    }

}
