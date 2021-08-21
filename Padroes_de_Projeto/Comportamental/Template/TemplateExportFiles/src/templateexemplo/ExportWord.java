/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateexemplo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author david
 */
public class ExportWord extends ExportFiles{

    private XWPFDocument document;
    private FileOutputStream out1 = null;
    
    public ExportWord(String texto) {
        super(texto);
    }
    
    @Override
    protected void createFile() {
        try {
            String current;
            current = new java.io.File(".").getCanonicalPath();
            out1 = new FileOutputStream(new File(current + "/src/" + "word.docx"));
            document = new XWPFDocument();
            //Blank Document
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
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(linha);
    }

    @Override
    protected void save() {
        try {
            document.write(out1);
            out1.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
