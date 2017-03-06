/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrinth;
import Model.*;
import View.LabyrinthView;
import View.LabyrinthViewImplConsole;

/**
 *
 * @author cc@armcloud.eu
 */
public class Labyrinth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Labyrinth Problem");
        System.out.println(" --- ");
        
            
       /**
        * create the Model
        */
        LabyrinthModel labyrinthModel = LabyrinthFactory.getLabyrinth("FILE");  
        //labyrinth.buildLabyrinth();
          
        /**
         * create the View 
         * 
         */
         LabyrinthViewImplConsole labyrinthTextConsole;
        labyrinthTextConsole = new LabyrinthViewImplConsole(labyrinthModel);
         //System.out.println(labyrinthTextConsole.toString());
         labyrinthTextConsole.getLabyrinth();
        
        /**
         * create the solver with Model and view as data 
         */




//          System.out.println("row "+labyrinth.getRowCount()+"   column "+labyrinth.getColumnCount()+
//                  "\n start"+labyrinth.getStartCell()+" finish "+labyrinth.getFinishCell());
//          System.out.println("cell "+labyrinth.getCellAt(4, 2));
    }
    
}
