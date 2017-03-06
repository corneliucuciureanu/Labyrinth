/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import Model.Cell;

/**
 *
 * @author cc@armcloud.eu
 */
public class StepObserver implements LabyrinthObserver {

    StepObserver() {
        System.out.println("Step Observer Created");
    }
    
    @Override
    public void processCell(Cell c) {
        System.out.println("Curent cell"+c.toString());
                
    }

    @Override
    public void processSolution() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
