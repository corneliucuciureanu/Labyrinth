/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author cc@armcloud.eu
 */
public interface LabyrinthModel {
    public static final int START_CELL=-1;
    public static final int FINISH_CELL = 2;
    public static final int FREE_CELL=0;
    public static final int WALL_CELL=1;
    
    
    
    
    //public static final Constanta;
    // Pentru Factory Methods
    public void buildLabyrinth();
    
    public int getRowCount();
    
    public int getColumnCount();
    
    public boolean isFreeAt(int row,int column);
    
    public boolean isFreeAt(Cell c);
    
    public boolean isWallAt(int row ,int column);

    public boolean isWallAt(Cell c);
    
    public Cell getStartCell();
    
    public Cell getFinishCell();
    
    public int getNextCell(int row, int column);
    
    public int getNextCell(Cell c);
    
    public int getCellAt(int row, int column);
    
    public int getCellAt(Cell c);
    
    public void resetCurrentCell();
    
    public void setCurrentCell(int row,int column);
    
    public void setCurrentCell(Cell c);
            
}



