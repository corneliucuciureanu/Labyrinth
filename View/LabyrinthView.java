/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *interface LabyrinthView responsible with describing the text representation of a labyrinth
 * 
 |S|*|*|*|*|
 | | |*|*|*|
 |*| |*|*|*|
 |*| | |*|*|
 |*|*|F|*|*|
  
 * @author cc@armcloud.eu
 */
public interface LabyrinthView {
    
    /**
     *Get the Labyrinth
     */
    public void getLabyrinth();
    
    /**
     *Set the Labyrinth
     */
    public void setLabyrinth();
    
    
    /**
     *the String of text representation of Labyrinth 
     * 
     * @return String of Labyrinth
     */
    @Override
     public String toString();
}
