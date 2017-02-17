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
public class LabyrinthFactory {
    public LabyrinthModel getLabyrinth(String builderType) {
        //System.out.println("Builder Factory");
        if (builderType == null) {
            return null;
        }
        
        if (builderType.equalsIgnoreCase("FILE")){
            return new ReadFileBuilder();
        } else if(builderType.equalsIgnoreCase("RANDOM")) {
            return new RandomBuilder();
        } else if(builderType.equalsIgnoreCase("CONSOLE")) {
            return new ConsoleBuilder();
        }
        
        //System.out.println("null object");
        return null;
    }
}
