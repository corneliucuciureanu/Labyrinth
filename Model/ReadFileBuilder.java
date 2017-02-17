/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cc@armcloud.eu
 */
public class ReadFileBuilder implements LabyrinthModel {
    
    public ReadFileBuilder() {
        System.out.println("Created Read File Builder object");
    }

    @Override
    public void buildLabyrinth() {
        System.out.println("Executing Read File Builder object");
        List <Integer> labyrinthList = new ArrayList<>();
        FileReader f = null;
        boolean add;
        
        try {
            // open file 
            f = new FileReader(labyrinth.Parameters.INPUT_FILE);
            int c;
            while( (c=f.read()) != -1)
                System.out.print((char)c);
            add = labyrinthList.add(c);
            // set the start position 
            if (c == -1) {
                 //LabyrinthModelImpl.class.   
            }
                
            if (add == false)
                System.out.print("list creation failed "+add);
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
            System.err.println("Exception: "+e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Reading file Error");
            System.err.println("Exception: "+e.getMessage());
        } finally {
            if(f != null) {
                System.out.println("Closing file!");
                try {
                    f.close();
                } catch (IOException e) {
                    System.err.println("File cannot be close!");
                    System.err.println("Exception: "+e.getMessage());
                }
            }
        }
        
    }

    @Override
    public void getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void isFreeAt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void isWallAt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getStartCell() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getFinishCell() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
