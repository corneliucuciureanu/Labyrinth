/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrinth;
import Model.*;

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
        
       // LabyrinthModelImpl labyrinth = new LabyrinthModelImpl("FILE");
        
          LabyrinthFactory builder = new LabyrinthFactory();
          LabyrinthModel labyrinth;
          labyrinth = builder.getLabyrinth("FILE");
          labyrinth.buildLabyrinth();
        
    }
    
}
