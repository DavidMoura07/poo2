/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateexemplo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class ExportHTML extends ExportFiles{

    private BufferedWriter out = null;
    
    public ExportHTML(String texto) {
        super(texto);
    }

    @Override
    protected void createFile() {
        try {
            String current;
            current = new java.io.File(".").getCanonicalPath();
            File file = new File(current + "/src/" + "index.html");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            out = new BufferedWriter(fw);
            out.write("<HTML><BODY>");
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    protected void export(String txt) {
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            printLine((String)linhas);
        }
    }

    private void printLine(String linha) {
        try {
            out.write("<BR>" + linha);
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void save() {
        try {
            out.write("</BODY>");
            out.write("</HTML>");
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
