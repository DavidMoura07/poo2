
package templateexemplo;


public class TemplateMain {

   
    public static void main(String[] args) {
        String texto = "linha 1\n" 
                + "linha2\n"
                + "fim\n";                                
      ExportFiles exportHTML = new ExportHTML(texto);
      ExportFiles exportWord = new ExportWord(texto);
    }
    
}
