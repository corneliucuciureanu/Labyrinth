/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.*;

/**
 *
 * @author cc@armcloud.eu
 */
public class ReadFileBuilder implements LabyrinthBuilder {
    
    public ReadFileBuilder() {
        System.out.println("Created Read File Builder object");
    }

    @Override
    public void buildLabyrinth() {
        System.out.println("Executing Read File Builder object");
        FileReader f = null;
        try {
            // open file 
            f = new FileReader(labyrinth.Parameters.INPUT_FILE);
            int c;
            while( (c=f.read()) != -1)
                System.out.print((char)c);
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
    
}
