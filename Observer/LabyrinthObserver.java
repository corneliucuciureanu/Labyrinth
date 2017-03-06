/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import Model.Cell;

/**
 * interface LabyrinthObserver that describes an observer of the labyrinth exploration
 * @author cc@armcloud.eu
 */
public interface LabyrinthObserver {
    public void  processCell(Cell c);
    public void processSolution();
}
