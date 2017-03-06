/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.*;
import java.util.Arrays;

/**
 *  Labyrinth Impl Read File Builder
 * @author cc@armcloud.eu
 */
public final class ReadFileBuilder implements LabyrinthModel {
    private final int[][] labyrinthMatrix;
    //private List  labyrinthList = new ArrayList<>();
    
    private int rowCount;  // numer of row in the read matrix file 
    private int columnCount; // number of column 
    
    /**
     * Class to save the row and column position of start cell and finish cell
     */
    
    private Cell start; // The position to start with value -1 , START_CELL
    private Cell finish; // the position to finish searching the labyrinth 2 , FINISH_CELL
    private Cell currentCell; // the current cell from when searching the labyrinth
    
    public ReadFileBuilder() {
        this.labyrinthMatrix = new int[50][];
         //System.out.println("Created Read File Builder object");
         //start = new Cell();
        buildLabyrinth();  //warning overridable methods call in constructor warning 
        
    }

    @Override
    public void buildLabyrinth() {
        //System.out.println("Executing Read File Builder object");
        
        FileReader f = null;
        boolean add;
        
        try {
            // open file 
            f = new FileReader(labyrinth.Parameters.INPUT_FILE);
            
            //bufferd reading the file 
            BufferedReader br = new BufferedReader(f);
            String line;
            for(int i=0; (line = br.readLine()) != null; ++i ) {
                // read one line from the file 
                final String[]  tokens;
                tokens = line.split(" ");
                columnCount = tokens.length;
                final int[] parsed = new int[tokens.length];
                //for to split one buffered read line into tokens to fill one matrix cell 
                for(int j=0; j<tokens.length;j++) {
                   parsed[j] = Integer.parseInt(tokens[j]); 
                   //System.out.print(" "+parsed[j]);
                  
                   if (parsed[j]==START_CELL) 
                       start = new Cell(i,j);
                   
                   if (parsed[j]==FINISH_CELL) 
                       finish = new Cell(i,j);
                   
                       
                }
                labyrinthMatrix[i] = parsed;
                rowCount = i+1;
            }
            // print the read labyrinth matrix in the short form 
            //System.out.println("---> "+Arrays.deepToString(labyrinthMatrix));

        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
            System.err.println("Exception: "+e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Reading file Error");
            System.err.println("Exception: "+e.getMessage());
        } finally {
            if(f != null) {
                //System.out.println("Closing file!");
                try {
                    f.close();
                } catch (IOException e) {
                    System.err.println("File cannot be close!");
                    System.err.println("Exception: "+e.getMessage());
                }
            }
        }
               
    }

    /**
     * Getter return the count of rows in the matrix
     * 
     * @return the integer value of rows count
     */
    @Override
    public int getRowCount() {
        return rowCount;        
    }

    /** Getter return the count of number of column in the matrix
     * 
     * @return the integer value of column count
     */
    @Override
    public int getColumnCount() {
        return columnCount;        
    }

    /**
     * If labyrinthMatrix[row][column] == 0 retrun true 
     * else return false
     * 
     * @return boolean
     * @param row 
     * @param column
     */
    @Override
    public boolean isFreeAt(int row, int column) {
        return this.labyrinthMatrix[row][column] == FREE_CELL; 
    }
    
    @Override
    public boolean isFreeAt(Cell c) {
        return this.labyrinthMatrix[c.rowCell][c.columnCell] == FREE_CELL;
    }

    @Override
    public boolean isWallAt(int row, int column) {
        return this.labyrinthMatrix[row][column] == WALL_CELL;
    }
    
    @Override
    public boolean isWallAt(Cell c) {
        return this.labyrinthMatrix[c.rowCell][c.columnCell] == WALL_CELL;
    }

    @Override
    public Cell getStartCell() {
        return start;        
    }

    @Override
    public Cell getFinishCell() {
        return finish;        
    }
    
    @Override
    public int getNextCell(int row, int column){
        return labyrinthMatrix[row][column+1];
    }
    
    @Override
    public int getNextCell(Cell c){
        return labyrinthMatrix[c.columnCell][c.columnCell+1];
    }
    
    @Override
    public int getCellAt(int row, int column) {
        return labyrinthMatrix[row][column];
    }
    
    @Override
    public int getCellAt(Cell c) {
        return labyrinthMatrix[c.rowCell][c.columnCell];
    }
    
    /**
     * Set the current cell to start cell value;
     */
    @Override
    public void resetCurrentCell() {
        currentCell=start;
    }
    
    @Override
    public void setCurrentCell(int row,int column) {
        currentCell.columnCell= column;
        currentCell.rowCell=row;
    }
    
    @Override
    public void setCurrentCell(Cell c) {
        currentCell = c;
    }
}
