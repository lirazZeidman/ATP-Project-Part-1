package algorithms.mazeGenerators;

public interface IMazeGenerator {
    /**
     * creates a maze sized row*column
     * @param row - row size of the maze
     * @param column - column size of the maze
     * @return randomised maze sized row*column
     */
    public Maze generate(int row, int column);

    /***
     * measuring the time to create a maze sized row*column
     * @param row - row size of the maze
     * @param column - column size of the maze
     * @return the time measured
     */
    public long measureAlgorithmTimeMillis(int row, int column);
}
