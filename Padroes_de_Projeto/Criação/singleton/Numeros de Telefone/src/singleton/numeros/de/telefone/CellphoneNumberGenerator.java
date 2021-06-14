/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.numeros.de.telefone;

import file.manager.FileManager;

/**
 *
 * @author david
 */
public class CellphoneNumberGenerator {
    
    private static CellphoneNumberGenerator instance;
    
    public synchronized static CellphoneNumberGenerator getInstance() {
        if(instance == null) {
            instance = new CellphoneNumberGenerator();
        }
        return instance;
    }
    
    // instance variables counter
    private int cellphoneNumber;
    FileManager fm;
    
    // private constructor
    private CellphoneNumberGenerator(){
        this.fm = new FileManager();
        String number = this.fm.read();
        this.cellphoneNumber = Integer.parseInt(number, 10);
    }
    
    public synchronized int generateNextCellphoneNumber(){
        ++this.cellphoneNumber;
        this.fm.write(Integer.toString(this.cellphoneNumber));
        return this.cellphoneNumber;
    }
    
}
