/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class FileManager {
    
    private String path;
    private String initialValue;
    private File file;

    public FileManager() {
        this.path = "telefone.txt";
        this.initialValue = "999990101";
        this.file = new File(this.path);
    }

    public FileManager(String path, String initialValue) {
        this.path = path;
        this.initialValue = initialValue;
        this.file = new File(this.path);
    }

    public FileManager(String path) {
        this.path = path;
        this.initialValue = "";
        this.file = new File(this.path);
    }
    
    
    
    public String read(){
        try {
            return new String(Files.readAllBytes(this.file.toPath()));
        } catch (FileNotFoundException ex) {
            this.create();
            this.write(this.initialValue);
            return this.read();
        } catch (IOException ex) { 
            this.create();
            this.write(this.initialValue);
            return this.read();
        }
    }
    
    public void create(){
        try {
            this.file.createNewFile();
            Logger.getLogger(FileManager.class.getName()).log(Level.INFO, "File created: {0}", this.file.getName());                
        } catch (IOException ex1) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex1);
        }
    }
    
    
    public void write(String text){
        try {
            try (FileWriter writer = new FileWriter(this.path)) {
                writer.write(text);
            }
            Logger.getLogger(FileManager.class.getName()).log(Level.INFO, "Successfully wrote " + text + " to the {0} file.", this.file.getName());
        } catch (IOException e) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void reset(){
        this.write(this.initialValue);
    }
}
