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
    
    //public static final Constanta;
    
    public void getRowCount();
    
    public void getColumnCount();
    
    public void  isFreeAt();
    
    public void isWallAt();
    
    public void getStartCell();
    
    public void getFinishCell();
}
