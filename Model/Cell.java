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
public class Cell {
        int rowCell;
        int columnCell;
        Cell() {
            rowCell=0;
            columnCell =0;
        }
        Cell(int row, int column){
            this.rowCell=row;
            this.columnCell=column;
        }
        
        @Override
        public String toString(){
            return "Cell( row= "+this.rowCell+", column= "+this.columnCell+")";
        }
    
    }