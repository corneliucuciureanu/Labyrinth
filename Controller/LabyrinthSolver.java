/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 * Here Observers goes ! 
 * 
 * 
 * @author cc@armcloud.eu
 */
public interface LabyrinthSolver {
    
    public void getLabyrinth();
    
    public void setLabyrinth();
   
    // test where is the next step in cell will be
    public void  nextCellToExplore();
    
    /**
     * go to the maze to search for a solution 
     * 
     * @return true if the labyrinth can be solved or false it cannot be 
     */
    public boolean solve();
}
